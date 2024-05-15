// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#dataTable').DataTable();
});

async function loadUsers(){
   const data = await fetch('users',{
   method:'GET',
    headers: {
          'Accept':'application/json',
         'Content-Type': 'application/json'
         // 'Content-Type': 'application/x-www-form-urlencoded',
       },
   })

   const users= await data.json();

   let dat='';
   for(let user of users)
   {
       let datq='<tr><td>1</td><td>'+user.name+'</td><td>Corona</td><td>'+user.email+'</td><td>'+user.phone+'</td><td>'+user.password+'</td><td>'+user.role+'</td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></td></tr>'
      dat +=datq;
   }

   document.querySelector("#dataTable tbody").outerHTML=dat;
}
