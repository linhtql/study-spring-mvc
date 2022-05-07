![](https://stackjava.com/wp-content/uploads/2017/12/spring-mvc-flow.png)
![](https://stackjava.com/wp-content/uploads/2017/12/spring-mvc-flow-768x471.jpg)
<p> Khi có một request nào đó tới ứng dụng web thì đều sẽ được gửi tới Front-COntroller(Dispatcher Servlet)</p>
<p>Front-Controller sẽ sử dụng Handler Mapping để biết xem controller nào sẽ xử lý request đó </p>
<p> Controller nhận request, gọi tới các class service thích hợp để xử lý yêu cầu </p>
<p>Sau khi xử lý xong, Controller sẽ nhận được model từ tầng Service hoặc tầng DAO </p>
<p>Controller gửi model vừa nhận được tới Front Controller (Dispatcher Servlet) </p>
<p>Dispatcher Servlet sẽ tìm các mẫu view, sử dụng view resolver và truyền model vào nó </p>
<p>View template, model, view page được build và gửi trả lại Front Controller </p>
<p>Front Controller gửi một page view tới trình duyệt để hiển thị nó cho người dùng </p>
<p>Trong Mô hình MVC thì:</p>
<ul>
  <li><b>Model</b>: là các file POJO, Service, DAO thực hiện truy cập database, xử lý business</li>
<li><b>View</b>: là các file JSP, html…</li>
<li><b>Controller</b>: là Dispatcher Controller, Handler Mapping, Controller – thực hiện điều hướng các request.</li>
</ul>
