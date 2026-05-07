<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:forEach var="post" items="${posts}">
    <div class="post-card" data-id="${post.id}">
        <div class="post-header">
            <span class="author">@${post.authorName}</span>
            <span class="time"><fmt:formatDate value="${post.createdAt}" pattern="dd/MM/yyyy HH:mm"/></span>
        </div>
        <h3 class="post-title">${post.title}</h3>
        <p class="post-body">${post.body}</p>
        <div class="post-footer">
            <button class="like-btn" onclick="toggleLike(${post.id}, this)">
                <span class="like-count">${post.likeCount}</span> Likes
            </button>
            <span class="status">${post.status}</span>
        </div>
    </div>
</c:forEach>

<script>
function toggleLike(postId, btn) {
    const formData = new URLSearchParams();
    formData.append('postId', postId);

    fetch('like', {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: formData
    })
    .then(response => response.text())
    .then(result => {
        const countSpan = btn.querySelector('.like-count');
        let currentCount = parseInt(countSpan.innerText);
        if (result === 'liked') {
            countSpan.innerText = currentCount + 1;
            btn.style.color = 'red';
        } else if (result === 'unliked') {
            countSpan.innerText = currentCount - 1;
            btn.style.color = 'black';
        }
    })
    .catch(error => console.error('Error:', error));
}
</script>
