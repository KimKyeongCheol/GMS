package com.hanbit.gms.constant;


public class SQL {
	public static final String MEMBER_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s) VALUES(?,?,?,?,SYSDATE)",Database.TABLE_MEMBER,Database.MEMBER_ID,Database.MEMBER_NAME,Database.MEMBER_PASSWORD,Database.MEMBER_SSN,Database.MEMBER_REGDATE);
	//,Database.MEMBER_ID,Database.MEMBER_NAME,Database.MEMBER_PASSWORD,Database.MEMBER_SSN,Database.ARTICLE_REGDATE
	public static final String MEMBER_LIST=String.format("SELECT * FROM %s",Database.TABLE_MEMBER);
	public static final String MEMBER_FINDBYNAME=String.format("select * from %s where %s=?",Database.TABLE_MEMBER,Database.MEMBER_NAME);
	public static final String MEMBER_FINDBYID=String.format("select * from %s where %s=?",Database.TABLE_MEMBER,Database.MEMBER_ID);
	public static final String MEMBER_COUNT=String.format("SELECT COUNT(*) AS COUNT FROM %s",Database.TABLE_MEMBER);
	public static final String MEMBER_UPDATE=String.format("UPDATE %s SET %s=? WHERE %s=?",Database.TABLE_MEMBER,Database.MEMBER_PASSWORD,Database.MEMBER_ID);
	public static final String MEMBER_DELETE=String.format("DELETE FROM %s WHERE %s=?",Database.TABLE_MEMBER,Database.MEMBER_ID);
	
	
	public static final String ARTICLE_COUNT=String.format("SELECT COUNT(*) AS COUNT FROM %s",Database.TABLE_ARTICLE);
	public static final String ARTICLE_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s,%s) VALUES(article_seq.nextval,?,?,?,0,SYSDATE)",Database.TABLE_ARTICLE,Database.ARTICLE_SEQ,Database.ARTICLE_ID,Database.ARTICLE_TITLE,Database.ARTICLE_CONTENT,Database.ARTICLE_HITCOUNT,Database.ARTICLE_REGDATE);
	
	//public static final String ARTICLE_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s,%s) VALUES (article_seq.nextval,?,?,?,0,SYSDATE)",Database.TABLE_ARTICLE,Database.ARTICLE_SEQ,Database.ARTICLE_ID,Database.ARTICLE_TITLE,Database.ARTICLE_CONTENT,Database.ARTICLE_HITCOUNT,Database.ARTICLE_REGDATE);
	
	//public static final String ARTICLE_INSERT=String.format("INSERT INTO %s VALUES(article.nextval,?,?,?,0,SYSDATE)",Database.TABLE_ARTICLE);
	//,Database.ARTICLE_SEQ,Database.ARTICLE_ID
	//atabase.ARTICLE_TITLE,Database.ARTICLE_CONTENT,Database.ARTICLE_REGDATE,Database.ARTICLE_HITCOUNT
	public static final String ARTICLE_LIST=String.format("SELECT * FROM %s",Database.TABLE_ARTICLE);
	public static final String ARTICLE_FINDBYID=String.format("SELECT * FROM %s WHERE %s=?",Database.TABLE_ARTICLE,Database.ARTICLE_ID);
	public static final String ARTICLE_FINDBYSEQ=String.format("SELECT * FROM %s WHERE %s=?",Database.TABLE_ARTICLE,Database.ARTICLE_SEQ);
	public static final String ARTICLE_UPDATE=String.format("UPDATE %s SET %s=?, %s=? WHERE %s=?",Database.TABLE_ARTICLE,
			Database.ARTICLE_TITLE,Database.ARTICLE_CONTENT,Database.ARTICLE_SEQ);
	public static final String ARTICLE_DELETE=String.format("DELETE FROM %s WHERE %s=?",Database.TABLE_ARTICLE,Database.ARTICLE_SEQ);
}
