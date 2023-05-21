<html>
<head>
    <title>Movie Details</title>
</head>
<body>
    <h1>Movie Details</h1>

    <table border="1">
        <tr>
            <th>Title</th>
            <th>Year</th>
            <th>Rating</th>
            <th>Country of Origin</th>
            <th>Comments</th>
            <th>Update</th>
        </tr>

                    <tr>
                        <td></td>
                        <td></td>
                        <td><%= rating %></td>
                        <td><%= countryOfOrigin %></td>
                        <td>
                            <form action="updateComments.jsp" method="post">
                                <input type="hidden" name="title" value="">
                                <textarea name="comments"></textarea>
                                <button type="submit">Update</button>
                            </form>
                        </td>
                    </tr>
                    
    </table>

</body>
</html>
