/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import LearnJav.model.wordDAO;
import LearnJav.ulity.Word;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meep
 */
@WebServlet(name = "WordSevlet", urlPatterns = {"/WordSevlet"})
public class WordSevlet extends HttpServlet {

    @EJB
    private wordDAO wordDAO;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String wordId = request.getParameter("WordId");
        String wordSearch = request.getParameter("WordSearch");
        String wordCatalog = request.getParameter("WordCatalog");
        String wordKanji = request.getParameter("WordKanji");
        String wordKata = request.getParameter("WordKata");
        String wordMean = request.getParameter("WordMean");
        String wordLocation = request.getParameter("WordLocation");
        String action = request.getParameter("action");

        Word word = new Word(wordId, wordSearch, wordCatalog, wordKanji, wordKata, wordMean, wordLocation);

        if (action.equalsIgnoreCase("Add")) {
            wordDAO.addWord(word);
            request.setAttribute("word", word);
             request.getRequestDispatcher("wordinfo.jsp").forward(request, response);
        } else if (action.equalsIgnoreCase("Edit")) {
            wordDAO.editWord(word);
            Word searchedWord = wordDAO.searchWord(wordId);
            request.setAttribute("word", searchedWord);
             request.getRequestDispatcher("wordinfo.jsp").forward(request, response);
        } else if (action.equalsIgnoreCase("Delete")) {
            wordDAO.deleteWord(word);
             request.getRequestDispatcher("wordinfo.jsp").forward(request, response);
        } else if (action.equalsIgnoreCase("Search")) {
                      Word searchedWord = wordDAO.searchWord(wordSearch);
          request.setAttribute("word", searchedWord);
           request.getRequestDispatcher("wordinfo.jsp").forward(request, response);
          
           
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
