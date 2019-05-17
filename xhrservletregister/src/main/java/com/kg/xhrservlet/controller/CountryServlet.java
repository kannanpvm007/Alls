package com.kg.xhrservlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.kg.xhrservlet.model.Country;

/**
 * Helloservlet
 */
@WebServlet("/country/*")
// @WebServlet(name = "/country", urlPatterns = {"/country/*"})

public class CountryServlet extends HttpServlet {
    ArrayList<Country> countryList = new ArrayList<Country>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        System.out.println("do get called");
        String query = "SELECT * from country";
        try {

            List<Object> list = MysqlConnect.getDbCon().resultSetToArrayList(query);
            List<Country> countryList = (List<Country>) (List<?>) list;

            String countryJsonString = new Gson().toJson(countryList);
            System.out.println(countryJsonString);

            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(countryJsonString);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do delete called");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        System.out.println("????? requestData ?????\n\n" + requestData + "\n\n");

        Gson gson = new Gson();
        Country country = gson.fromJson(requestData, Country.class);

        System.out.println("$$$$$$$$$$$$$$");
        System.out.println(country.getCountryid() + " ---->" + country.getCountryname());

        int countryid = Integer.parseInt(country.getCountryid());

        String sql = "DELETE FROM country WHERE countryid='" + countryid + "'";
        System.out.println(sql);
        try {
            int resultSet = MysqlConnect.getDbCon().insert(sql);
            doGet(req, resp);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // String pathInfo = req.getPathInfo();
        // System.out.println("pathInfo " + Integer.parseInt(pathInfo));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do put called");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        System.out.println("????? requestData ?????\n\n" + requestData + "\n\n");

        Gson gson = new Gson();
        Country country = gson.fromJson(requestData, Country.class);

        System.out.println("$$$$$$$$$$$$$$");
        System.out.println(country.getCountryid() + " ---->" + country.getCountryname());

        int countryid = Integer.parseInt(country.getCountryid());
        // int countryid = country.getCountryid();
        String countryname = country.getCountryname();

        String sql = "UPDATE country SET countryid='" + countryid + "',countryname='" + countryname
                + "' WHERE countryid=" + countryid;
        System.out.println(sql);
        try {
            int resultSet = MysqlConnect.getDbCon().insert(sql);
            doGet(req, resp);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws JsonSyntaxException, IllegalStateException, ServletException, IOException {
        System.out.println("do post called");
        setAccessControlHeaders(resp);

        String requestData = req.getReader().lines().collect(Collectors.joining());
        System.out.println("????? requestData ?????\n\n" + requestData + "\n\n");

        Gson gson = new Gson();
        Country country = gson.fromJson(requestData, Country.class);

        System.out.println("$$$$$$$$$$$$$$");
        System.out.println(country.getCountryid() + " ---->" + country.getCountryname());

        int countryid = Integer.parseInt(country.getCountryid());
        // int countryid = country.getCountryid();
        String countryname = country.getCountryname();
        // Calendar calendar = Calendar.getInstance();
        // java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        String sql = "INSERT INTO  country(countryid,countryname)values('" + countryid + "','" + countryname + "')";
        System.out.println(sql);
        try {
            int resultSet = MysqlConnect.getDbCon().insert(sql);
            doGet(req, resp);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void setAccessControlHeaders(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:9090");
        resp.setHeader("Access-Control-Allow-Methods", "GET");
        resp.setHeader("Access-Control-Allow-Methods", "POST");
        resp.setHeader("Access-Control-Allow-Methods", "DELETE");
    }

    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setAccessControlHeaders(resp);
        resp.setStatus(HttpServletResponse.SC_OK);
    }

}