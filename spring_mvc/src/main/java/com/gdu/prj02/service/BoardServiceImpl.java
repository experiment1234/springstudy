package com.gdu.prj02.service;

import javax.servlet.http.HttpServletRequest;

import com.gdu.prj02.dto.BoardDto;

public class BoardServiceImpl implements BoardService {

  @Override
  public void add1(HttpServletRequest reuqest) {
    int boardNo = Integer.parseInt(reuqest.getParameter("boardNo"));
    String title = request.getParameter("title");
    BoardDto boardDto = new BoardDto();
    boardDto.setBoardNo(boardNo);
    boardDto.setTitle(title);
       

  }

  @Override
  public void add2(int boardNo, String title) {
    // TODO Auto-generated method stub

  }

  @Override
  public void add3(BoardDto boardDto) {
    // TODO Auto-generated method stub

  }

}
