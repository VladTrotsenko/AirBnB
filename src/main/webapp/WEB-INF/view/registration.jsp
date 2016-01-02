
<head>
    <link rel="stylesheet" href="/css/loginRegistration.css" type="text/css">
</head>

    <form id="msform" action="/registration" method="post">
        <fieldset>
            <h2 class="fs-title">Create your account</h2>
            <input type="text" name="name" placeholder="First Name" />
            <input type="text" name="lastname" placeholder="Last Name" />
            <input type="text" name="email" placeholder="Email" />
            <input type="password" name="password" placeholder="Password" />
            <input type="password" name="confirmPpass" placeholder="Confirm Password" />
            <button name="next" type="submit" class="nextaction-button" value="Register">Sign me up</button>
        </fieldset>
    </form>