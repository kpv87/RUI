<%-- 
    Document   : PostTopic
    Created on : 07.11.2013, 18:04:55
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post your topic</title>
    </head>
    <body>
        <form id="topicDto" class="well anti-multipost" action="${pageContext.request.contextPath}/topics/new?branchId=54" method="POST" >
            <div class="control-group hide-on-preview">
                <div class="controls">
                    <input id="subject" name="topic.title" tabindex="100" placeholder="Название темы" class="span11 script-confirm-unsaved" type="text" value="" size="45" maxlength="255">
                </div>
            </div>
            <br>
            <div class="control-group">
                <div id="editorBBCODEdiv">
                    <textarea id="postBody" name="bodyText" tabindex="200" style="width:60%;height: 150px" placeholder="Содержание сообщения" class="script-confirm-unsaved"></textarea>
                </div>

                <br>
            </div>
            <input id="post" type="submit" class="btn btn-primary" accesskey="s" name="post" tabindex="300" value="Сохранить" data-original-title="">
            <br> <a href="${pageContext.request.contextPath}/">На главную</a>  
        </form>
    </body>
</html>
