<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<header>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</header>
<body>
<div class="p-4">
    <div class="container">
        <div class="row">
            <div class="col-md-5 col-sm-6 col-lg-3 mx-auto">
                <div class="formContainer">
                    <h2 class="p-2 text-center mb-4 h4" id="formHeading">Login</h2>
                    <form action="login" method="post">
                        <div class="form-group mt-3">
                            <label class="mb-2" for="username">Username</label>
                            <input class="form-control" id="username" name="username" type="email"/>
                        </div>
                        <div class="form-group mt-3">
                            <label class="mb-2" for="password">Password</label>
                            <input class="form-control" id="password" name="password" placeholder="username" />
                        </div>
                        <div class="mt-3">
                            <input type="checkbox" /> Remember me
                        </div>
                        <button class="btn btn-success btn-lg w-100 mt-4">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
