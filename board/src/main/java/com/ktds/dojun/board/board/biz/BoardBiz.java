package com.ktds.dojun.board.board.biz;

import java.util.List;

import com.ktds.dojun.board.board.vo.BoardSearchVO;
import com.ktds.dojun.board.board.vo.BoardVO;

/**
 * Created by Admin on 2017-02-17.
 */
public interface BoardBiz {

	public boolean writeArticle(BoardVO boardVO);

	public List<BoardVO> getAllArticles(BoardSearchVO searchVO);

	public BoardVO getOneArticle(int articleNum);

	public boolean deleteOneArticle(int articleNum);

	public boolean updateOneArticle(BoardVO boardVO);

}
