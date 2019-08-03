<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">My Phone</a>
        </div>
        <ul class="nav navbar-nav pull-right">
            <li><a href="/koszyk">Koszyk</a></li>
            <c:choose>
                <c:when test="${isAuthenticated==true}">
                    <li><a href="/logout">Wyloguj</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="/login">Zaloguj</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>