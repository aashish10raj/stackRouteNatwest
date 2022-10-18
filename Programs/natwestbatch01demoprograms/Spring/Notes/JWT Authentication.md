Session Management:
------------------
HTTP
----
- Hypertext Transfer Protocol
- Stateless

Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver

HTTP is a “stateless” protocol, which means that each time a client requests a Web page, the client establishes a new connection with the Web server, and the server does not retain track of prior requests.

The conversion of a user over a period of time is referred to as a session. In general, it refers to a certain period of time.
The recording of the object in session is known as tracking.
Session tracking is the process of remembering and documenting customer conversions over time. Session management is another name for it.
The term “stateful web application” refers to a web application that is capable of remembering and recording client conversions over time.

Why is Session Tracking Required?
---------------------------------
Because the HTTP protocol is stateless, we require Session Tracking to make the client-server relationship stateful.
Session tracking is important for tracking conversions in online shopping, mailing applications, and E-Commerce applications.
The HTTP protocol is stateless, which implies that each request is treated as a new one.

HttpSession API
---------------
- It is one of the technique to manage the session.

Create a session
-----------------

Request ------------> Server -----------------> Session --------------------> Unique Session Id

HttpSession session=request.getSession(); // By default - true
HttpSession session=request.getSession(false);


Storing in Session
-------------------
session.setAttribute();

Fetch something from session
-----------------------------
session.getAttribute();

























