package main.java;

import java.io.Reader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import main.java.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

/**
 * Created by m.slefarski on 2017-05-26.
 */
public class FullStackDemoStarter {


    public static void main(String args[]) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        //data
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current time: "+sdf.format(timestamp));


        //Create user
        User user = new User("qwerty234", "user_email@gmail.com", "lol");

        //Insert data	
        session.insert("User.insert", user);
        System.out.println("User inserted successfully.");


        //commit, close
        session.commit();
        session.close();
        
        
        System.exit(0);

    }


}
