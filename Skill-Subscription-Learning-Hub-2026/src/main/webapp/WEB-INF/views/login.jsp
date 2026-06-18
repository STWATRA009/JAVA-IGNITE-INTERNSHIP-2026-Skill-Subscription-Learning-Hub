<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Login - Skill Subscription Hub</title>

```
<!-- CSS -->
<link rel="stylesheet" href="/css/style.css">

<!-- JavaScript -->
<script src="/js/app.js"></script>
```

</head>

<body>

<!-- =========================
     HEADER
========================= -->

<div class="header">

```
<div class="header-left">
    <img src="/images/logo.png" alt="Logo">
    <h2>Skill Subscription Hub</h2>
</div>
```

</div>

<!-- =========================
     LOGIN FORM
========================= -->

<div class="container">

```
<h2>Login</h2>

<!-- Error Message -->
<% if(request.getAttribute("error") != null){ %>
    <p class="error">
        <%= request.getAttribute("error") %>
    </p>
<% } %>

<!-- Success Message -->
<% if(request.getAttribute("success") != null){ %>
    <p class="success">
        <%= request.getAttribute("success") %>
    </p>
<% } %>

<form action="/login"
      method="post"
      onsubmit="return validateLoginForm()">

    <label>Email</label>
    <input type="email"
           id="email"
           name="email"
           placeholder="Enter Email"
           required>

    <label>Password</label>
    <input type="password"
           id="password"
           name="password"
           placeholder="Enter Password"
           required>

    <button type="submit">
        Login
    </button>

</form>

<br>

<p>
    New User?
    <a href="/register">
        Register Here
    </a>
</p>
```

</div>

<!-- =========================
     FOOTER
========================= -->

<div class="footer">
    <p>© 2026 Skill Subscription Hub</p>
</div>

</body>
</html>
