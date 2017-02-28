package com.ktds.dojun.book.books.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.dojun.book.books.biz.BooksBiz;
import com.ktds.dojun.book.books.biz.BooksBizImpl;

public class DoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BooksBiz booksBiz;
	
	
	
    public DoDeleteServlet() {
    	booksBiz = new BooksBizImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookIdString = request.getParameter("bookId");

		int bookId = 0;

		try {
			bookId = Integer.parseInt(bookIdString);
		} catch (NumberFormatException e) {
			throw new RuntimeException("존재하지 않습니다.");
		}
			if(booksBiz.deleteBook(bookId)){
				
				response.sendRedirect("/book/books/list");
			}
			else{
				
				response.sendRedirect("/book/books/detail");
				
				
			}
		}
		
		
	}


