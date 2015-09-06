
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    session = request.getSession(false);
    if (session != null) {
        session.invalidate();
        request.getRequestDispatcher("/index.jsp?msg=Succesfully Logged Out").forward(request, response);
    }
    


%>
