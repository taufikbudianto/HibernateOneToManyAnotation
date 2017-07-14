package com.taufik.OneToManyHibernate;

import org.hibernate.Session;

import com.taufik.Model.Stock;
import com.taufik.Model.StockDetail;
import com.taufik.Util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Annotation" );
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Stock stock = new Stock();
        stock.setStockCode("code1");
        stock.setStockId(1);
        stock.setStockName("Name");
        session.save(stock);
        StockDetail detail1 = new StockDetail("1", "name", "123", stock);
        StockDetail detail2 = new StockDetail("2", "name2", "12341", stock);
        System.out.println(detail1);
       // stock.getStockdetail().add(detail1);
        //stock.getStockdetail().add(detail2);
        session.save(detail1);
        session.save(detail2);
        session.getTransaction().commit();
    }
}
