<html>
<body>
    <h2>Blog</h2>
	<form action="/blog/edit/${Blogposts.id}" method="post">
	    Title: <input type="text" name="title" value="${Blogposts.title}" /><br/>
	    Content: <textarea name="content">${Blogposts.content}</textarea><br/>
	    <input type="submit" value="Edit Post" />
	</form>

</body>
</html>