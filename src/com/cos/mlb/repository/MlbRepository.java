package com.cos.mlb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.mlb.db.DBConn;
import com.cos.mlb.model.Mlb;

public class MlbRepository {
       private static final String TAG ="MlbRepository";
       
       private static MlbRepository instance = new MlbRepository();
       private MlbRepository() {};
       
       public static MlbRepository getInstance() {
    	    return instance; 
       }
      
     private Connection conn = null; 
     private PreparedStatement pstmt = null; 
     private ResultSet rs = null; 
     
    public List<String> findList(){
    	final String SQL = "SELECT distinct team FROM mlb";
    	
    	try {
    		conn = DBConn.getConnection(); 
    		pstmt = conn.prepareStatement(SQL); 
    		
    		rs = pstmt.executeQuery();
    		
    		List<String> teamList = new ArrayList<String>();
    		while(rs.next()) { 
    			 String team = rs.getString("team");
    			 teamList.add(team);
    	    
    		}
    		System.out.println("teamList:" + teamList);		 
    		return teamList;
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG +"findList:" +e.getMessage());
		}finally {
			DBConn.close(conn, pstmt,rs);
		}
		return null;
    }
}
