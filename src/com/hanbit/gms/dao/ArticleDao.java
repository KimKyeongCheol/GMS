package com.hanbit.gms.dao;
import java.util.List;
import com.hanbit.gms.domain.ArticleBean;

public interface ArticleDao {
	public String insert(ArticleBean article);
	public List<ArticleBean> selectAll();
	public List<ArticleBean> selectById(String id);
	public ArticleBean selectBySeq(String seq);
	public String update(ArticleBean article);
	public String delete(String seq);
	public String count();
}
