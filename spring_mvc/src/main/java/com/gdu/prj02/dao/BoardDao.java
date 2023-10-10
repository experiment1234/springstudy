package com.gdu.prj02.dao;

import java.sql.Connection;

import com.gdu.prj02.dto.BoardDto;

public class BoardDao {

  private Connection con = null;
  
  public int insertBoard1(BoardDto boardDto) {
    System.out.println(boardDto);
    return 1;
  }
  
  public int insertBoard2(BoardDto boardDto) {
    System.out.println(boardDto);
    return 1;
  }
  
  public int insertBoard3(BoardDto boardDto) {
    System.out.println(boardDto);
    return 1;
  }
  
}