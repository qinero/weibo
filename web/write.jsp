
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>写微博</title>
    <style>
        body{ text-align:center}
        .div5{ width:80%; height:500px; border: 10px solid #ff870f; margin: auto;
        }
    </style>
    <style>
        body{ text-align:center}
        .div6{ width:380px; height:50px; margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="div6">
        <br>
        <font size="6" color="#ffa500">编辑微博</font>
    </div>
<br>
    <form action="WriteServlet" method="POST">
    <div class="div5">
            <textarea id="content" name="content"   style="width: 100%;height: 100%;"
                      onblur="this.value=this.value.trim()">
            </textarea>
    </div>
<br>
        <div class="b_clear submit">
            <button type="submit">提&nbsp;&nbsp;交</button>
        </div>
    </form>
</body>
</html>

