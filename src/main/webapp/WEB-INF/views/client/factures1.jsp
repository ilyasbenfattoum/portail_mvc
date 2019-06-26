<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>D3C - HOME</title>
  <!-- Custom fonts for this template-->
  <link href="<%=request.getContextPath() %>/resources/clientresources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="<%=request.getContextPath() %>/resources/clientresources/css/sb-admin-2.min.css" rel="stylesheet">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/clientresources/css/style.css" media="all" />
</head>

<body id="page-top">
  <!-- Page Wrapper -->
  <div id="wrapper">
      <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%=request.getContextPath() %>/index/">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">D3C- Portail</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/profile/">
          <i class="fas fa-fw fa-table"></i>
          <span>PROFILE</span></a>
      </li>
      
      <!-- Divider -->
      <hr class="sidebar-divider">
      <!-- Nav Item - Pages Collapse Menu -->
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/index/">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>HOME</span></a>
      </li>
	   <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/documents/">
          <i class="fas fa-fw fa-table"></i>
          <span>DOCUMENTS </span></a>
      </li>
	   <!-- Divider -->
      <hr class="sidebar-divider">
      <!-- Heading -->
      <div class="sidebar-heading">
        Addons
      </div>
	  <!-- Nav Item - Pages Collapse Menu -->
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/notification/">
          <i class="fas fa-fw fa-table"></i>
          <span>NOTIFICATIONS</span></a>
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/setting/">
          <i class="fas fa-fw fa-table"></i>
          <span>SETTINGS</span></a>
      </li>
      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/about/">
          <i class="fas fa-fw fa-table"></i>
          <span>ABOUT US</span></a>
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/contact/">
          <i class="fas fa-fw fa-table"></i>
          <span>CONTACT US</span></a>
      </li>

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>
    </ul>
	<!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">
      <!-- Main Content -->
      <div id="content">
        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>
          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>
          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">
            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

            <!-- Nav Item - Alerts -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-bell fa-fw"></i>
                <!-- Counter - Alerts -->
                <span class="badge badge-danger badge-counter">3+</span>
              </a>
              <!-- Dropdown - Alerts -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">
                <h6 class="dropdown-header">
                  Alerts Center
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-primary">
                      <i class="fas fa-file-alt text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">December 12, 2019</div>
                    <span class="font-weight-bold">A new monthly report is ready to download!</span>
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
              </div>
            </li>

            <!-- Nav Item - Messages -->
          
            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Youssef Balouki</span>
                <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">              
                <a class="dropdown-item" href="#">
                  <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                  Settings
                </a>            
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>
          </ul>
        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
      <center>  </center> <div class="container-fluid">
		 <!-- Content Row -->
		
          <div class="row"> <center>
		  <div class="col-xl-8 col-lg-7"></center>
              <!-- Area Chart -->
              <div class="card shadow mb-4">
                <div class="card-header py-3 d-sm-flex align-items-center justify-content-between mb-4">
                <center><h6 class="m-0 font-weight-bold text-primary">Facture</h6></center>
				<a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Download document</a>
                </div> 
				
       <div class="card-body">
      <header class="clearfix">    
      <h1> Doc No.2019-04-12 </h1>
      <div id="company" class="clearfix">
        <div>Company-France</div>
        <div>123 Rue de france,<br /> 75000 Paris, France</div>
        <div>(602) 519-0450</div>
        <div><a href="">compFrance@company.com</a></div>
      </div>
      <div id="project">
     <div><span>PROJECT</span> Company-France </div>
        <div><span>CLIENT</span> Youssef Balouki</div>
        <div><span>CLIENT NO </span> 409</div>
        <div><span>REF DOC</span> 2019-04-12  </div>
        <div><span>EMAIL</span> <a href="">youssefbalouki@gmail.com</a></div>
        <div><span>DATE</span> 12/04/2019</div>
        <div><span>DUE DATE</span> 15/04/2019</div>
      </div>
    </header>
      <main>
      <table>
        <thead>
          <tr>
            <th class="service">No Product</th>
            <th class="desc">DESCRIPTION</th>
            <th>QTY</th>
            <th>PU TTC</th>
            <th>REMISE</th>
            <th>TOTAL TTC</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="service">102</td>
            <td class="desc">Description product</td>
            <td class="qty">26</td>
            <td class="unit">$40.00</td>
            <td class="unit">05%</td>
            <td class="total">$1,040.00</td>
          </tr>
           <tr>
            <td class="service">107</td>
            <td class="desc">Description product</td>
            <td class="qty">10</td>
            <td class="unit">$80.00</td>
            <td class="unit">05%</td>
            <td class="total">$1,900.00</td>
          </tr>
           <tr>
            <td class="service">100</td>
            <td class="desc">Description product</td>
            <td class="qty">23</td>
            <td class="unit">$40.00</td>
            <td class="unit">08%</td>
            <td class="total">$1,000.00</td>
          </tr>
          </tr>
          <tr>
            <td colspan="5">SUBTOTAL</td>
            <td class="total">$5,200.00</td>
          </tr>
          <tr>
            <td colspan="5">TAX 25%</td>
            <td class="total">$1,300.00</td>
          </tr>
          <tr>
            <td colspan="5" class="grand total">GRAND TOTAL</td>
            <td class="grand total">$6,500.00</td>
          </tr>
        </tbody>
      </table>
      
      <div id="notices">
        <div>We thank you for your trust</div>
        <div>NOTICE:</div>
        <div class="notice">A finance charge of 1.5% will be made on unpaid balances after 30 days.</div>
      </div>
    </main>	
                  <hr>
                </div> 
              </div>
          <center>  </center></div>
          </div>
        </div>
        <!-- /.container-fluid -->
      </div>
      <!-- End of Main Content -->
 </div>
    <!-- End of Content Wrapper -->
  </div>
  
  
  
  
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="<%=request.getContextPath() %>/login/">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath() %>/resources/clientresources/vendor/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/clientresources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="<%=request.getContextPath() %>/resources/clientresources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="<%=request.getContextPath() %>/resources/clientresources/js/sb-admin-2.min.js"></script>
  <!-- Page level plugins -->
  <script src="<%=request.getContextPath() %>/resources/clientresources/vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="<%=request.getContextPath() %>/resources/clientresources/js/demo/chart-area-demo.js"></script>
  <script src="<%=request.getContextPath() %>/resources/clientresources/js/demo/chart-pie-demo.js"></script>
  <script src="<%=request.getContextPath() %>/resources/clientresources/js/demo/chart-bar-demo.js"></script>


</body>
</html>
