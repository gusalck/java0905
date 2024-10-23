package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJDBCTest {
    public static void main(String[] args) {
        Connection con = JDBCConnector.getConnection();
        String sql = "select 주문고객,제품명,수량 from 제품, 주문 where 제품번호=주문제품";
        PreparedStatement pstmt = null;
        try
        {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();

            while (result.next())// result가 가르키던 cursor가 첫번째 행을 가르키게 된다. 데이터행이 존재하면 true, 존재하지않으면 false
            {
                String customerId = result.getString("주문고객");
                String productName = result.getString("제품명");
                int count = result.getInt("수량");
                System.out.printf("- 주문고객명 : %s\t- 주문제품명 : %s\t- 수량 : %d\n",customerId,productName,count);
            }

        }
        catch (SQLException e)
        {
            System.out.println("문장객체 생성에 문제가 발생했습니다.");
            System.out.println(e);
        }
        try
        {
            pstmt.close();
            con.close();
        }
        catch (SQLException e)
        {
            System.out.printf("연결종료에 문제가 발생했습니다.");
        }
    }
}
