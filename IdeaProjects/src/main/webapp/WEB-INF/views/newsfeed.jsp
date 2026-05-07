<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>New Feed - SocialDemo</title>
    <link rel="stylesheet" type="text/css" href="style/posts.css">
    <style>
        .newsfeed-container { max-width: 600px; margin: 20px auto; }
        .post-card { background: white; border: 1px solid #ddd; padding: 15px; margin-bottom: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }
        .post-header { display: flex; justify-content: space-between; color: #666; font-size: 0.9em; margin-bottom: 10px; }
        .author { font-weight: bold; color: #007bff; }
        .post-title { margin: 0 0 10px 0; color: #333; }
        .post-footer { border-top: 1px solid #eee; padding-top: 10px; margin-top: 10px; display: flex; justify-content: space-between; font-size: 0.9em; }
        #loading { text-align: center; padding: 20px; display: none; }
    </style>
</head>
<body>
    <div class="header" style="text-align: center; padding: 20px; background: #007bff; color: white;">
        <h1>Social New Feed</h1>
        <p>Welcome, ${user.username} | <a href="logout" style="color: white;">Logout</a></p>
        <nav>
            <a href="posts" style="color: white; margin: 0 10px;">My Posts</a>
            <a href="users" style="color: white; margin: 0 10px;">Find People</a>
        </nav>
    </div>

    <div class="newsfeed-container">
        <div id="post-list">
            <jsp:include page="post_items.jsp" />
        </div>
        <div id="loading">Loading more posts...</div>
    </div>

    <script>
        let offset = ${nextOffset};
        let isLoading = false;
        let hasMore = true;

        window.onscroll = function() {
            if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight - 500) {
                loadMorePosts();
            }
        };

        function loadMorePosts() {
            if (isLoading || !hasMore) return;
            
            isLoading = true;
            document.getElementById('loading').style.display = 'block';

            fetch('newsfeed?offset=' + offset, {
                headers: { 'X-Requested-With': 'XMLHttpRequest' }
            })
            .then(response => response.text())
            .then(html => {
                if (html.trim() === '') {
                    hasMore = false;
                    document.getElementById('loading').innerText = 'No more posts to show.';
                } else {
                    document.getElementById('post-list').innerHTML += html;
                    offset += 5; // PAGE_SIZE
                    isLoading = false;
                    document.getElementById('loading').style.display = 'none';
                }
            })
            .catch(error => {
                console.error('Error loading posts:', error);
                isLoading = false;
                document.getElementById('loading').style.display = 'none';
            });
        }
    </script>
</body>
</html>
