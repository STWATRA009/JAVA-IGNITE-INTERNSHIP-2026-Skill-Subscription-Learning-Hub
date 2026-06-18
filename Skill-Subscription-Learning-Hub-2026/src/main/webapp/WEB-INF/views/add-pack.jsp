<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Skill Pack</title>

    <link rel="stylesheet" th:href="@{/css/style.css}">
    <script th:src="@{/js/app.js}"></script>
</head>

<body>

<!-- Header -->
<div class="header">
    <div class="header-left">
        <img th:src="@{/images/logo.png}" alt="Logo">
        <h1>Skill Subscription Hub</h1>
    </div>

    <div class="nav-links">
        <a th:href="@{/dashboard}">Dashboard</a>
        <a th:href="@{/packs}">Skill Packs</a>
        <a th:href="@{/logout}"
           onclick="return confirmLogout()">Logout</a>
    </div>
</div>

<!-- Form Container -->
<div class="container">

    <h2>Add Skill Pack</h2>

    <form th:action="@{/add-pack}" method="post">

        <label>Title</label>
        <input type="text"
               name="title"
               placeholder="Enter Skill Pack Title"
               required>

        <label>Description</label>
        <textarea
                name="description"
                placeholder="Enter Skill Pack Description"
                required>
        </textarea>

        <label>Price</label>
        <input type="number"
               step="0.01"
               name="price"
               placeholder="Enter Price"
               required>

        <button type="submit">
            Save Skill Pack
        </button>

    </form>

    <br>

    <a th:href="@{/packs}" class="btn">
        Back to Skill Packs
    </a>

</div>

<!-- Footer -->
<div class="footer">
    <p>&copy; 2026 Skill Subscription Hub</p>
</div>

</body>
</html>
