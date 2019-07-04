<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm">
            <g:form name="registerForm" action="register" controller="register" method="post">
                <div class="form-group">
                    <label for="firstname">First Name: </label>
                    <g:field type="text" name="firstname" class="form-control" placeholder="First Name"></g:field>
                </div>
                <div class="form-group">
                    <label for="lastname">Last Name: </label>
                    <g:field type="text" name="lastname" class="form-control" placeholder="Last Name"></g:field>
                </div>
                <div class="form-group">
                    <label for="username">Username: </label>
                    <g:field type="text" name="username" class="form-control" placeholder="Username"></g:field>
                </div>

                <div class="form-group">
                    <label for="password">Password: </label>
                    <g:field type="password" name="password" class="form-control" placeholder="password"></g:field>
                </div>
                <button type="submit" class="btn btn-primary">Register</button>
            </g:form>
        </div>
    </div>
</div>
</body>
</html>
