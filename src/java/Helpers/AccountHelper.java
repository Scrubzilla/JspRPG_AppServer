/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Pojo.GenericHelper;
import java.util.List;
import jsrpg.Account;
import jsrpg.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class AccountHelper {

    public String createAccount(String email, String username, String password, String securityQuest, String securityAns) {
        GenericHelper genHelp = new GenericHelper();
        int id = genHelp.getCount("Id", "Account") + 1;

        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Account account = new Account();
            account.setId(id);
            account.setRole(0);
            account.setUsername(username);
            account.setEmail(email);
            account.setPassword(password);
            account.setSecurityquestion(securityQuest);
            account.setSecurityquestionans(securityQuest);

            session.save(account);
            session.getTransaction().commit();

            session.close();

        } catch (Exception e) {

            e.printStackTrace();
            tx.rollback();
            return "Error during creation of account";
        }
        return "Successfully created an account with the username " + username;
    }

    public Account getAccount(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account A where A.username = :Username");
            q.setParameter("Username", username);
            accountList = (List<Account>) q.list();
            System.out.println("ACCOUNT TEST:     " + accountList.get(0));
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        return accountList.get(0);
    }

    public String checkUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account");
            accountList = (List<Account>) q.list();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        String message = "0";
        for (Account account : accountList) {
            if (account.getUsername().equalsIgnoreCase(username)) {
                message = "1";
            }
        }
        return message;
    }

    public String checkEmail(String eMail) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account");
            accountList = (List<Account>) q.list();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        String message = "0";
        for (Account account : accountList) {
            if (account.getEmail().equalsIgnoreCase(eMail)) {
                message = "1";
            }
        }
        return message;
    }

    public String changePassword(String accName, String newPassword) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            String hql = "UPDATE Account SET Password =:password WHERE username =:Username";
            Query query = session.createSQLQuery(hql);
            query.setParameter("Username", accName);
            query.setParameter("password", newPassword);
            int result = query.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Rows Affected: " + result);
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
            session.close();
            return "Not successfull";
        }
        return "Successfull";
    }

    public String checkLogInCred(String accUser, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account");
            accountList = (List<Account>) q.list();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        String message = "";
        for (Account account : accountList) {
            if (account.getUsername().equalsIgnoreCase(accUser) && account.getPassword().equalsIgnoreCase(password)) {
                message = account.getUsername();
            } else {
                message = "0";
            }
        }
        return message;
    }

    public String getSecurityQuestion(String username) {
        String message = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account where Username =:username");
            q.setParameter("username", username);
            accountList = (List<Account>) q.list();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        message = accountList.get(0).getSecurityquestion();

        return message;
    }

    public String checkSecurityAnswer(String username, String answer) {
        String message = "0";

        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Account> accountList = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        try {

            Query q = session.createQuery("from Account where Username =:username");
            q.setParameter("username", username);
            accountList = (List<Account>) q.list();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        
        if(accountList.get(0).getSecurityquestionans().equalsIgnoreCase(answer)){
            message = "1";
        }

        return message;
    }

}
