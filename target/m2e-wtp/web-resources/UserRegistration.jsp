<!DOCTYPE html>
<html lang="en">
<head>
<title>Patient Health Advisor</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,intial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-lg-offset-3">
				<h3 style="font-family: arial; color: #c6d6f6">Patient Health
					Advisor</h3>
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title" style="">Please Register</h3>

					</div>
					<div class="panel-body">
						<form name="Register" method="Post" action="add">
							<div class="form-group">
								<label for="fname">FirstName</label> <input type="text"
									class="form-control" id="fname" name="fname" placeholder="FirstName">
							</div>
							<div class="form-group">
								<label for="lname">LastName</label> <input type="text"
									class="form-control" id="lname" name="lname" placeholder="LastName">
							</div>
							<div class="form-group">
								<label for="gender">Gender</label> <label><input
									type="radio" name="optradio">Male</label> <label><input
									type="radio" name="optradio">Female</label>
							</div>

							<div class="form-group">
								<label for="uname">UserName</label> <input type="text"
									class="form-control" id="uname" placeholder="UserName">
							</div>
							<div class="form-group">
								<label for="pword">Password</label> <input type="password"
									class="form-control" id="pword" placeholder="Password">
							</div>
							<div class="form-group">
								<label for="cpword">Confirm Password</label> <input
									type="password" class="form-control" id="cpword"
									placeholder="Confirm Password">
							</div>
							<div class="form-group">
								<label for="dob">Date of Birth</label> <input type="date"
									class="form-control" id="dob" placeholder="Date Of Birth">
							</div>
							<div class="form-group">
								<label for="email">Email</label> <input type="email"
									class="form-control" id="email" placeholder="Email">
							</div>
							<div class="form-group">
								<label for="mobile">Mobile Number</label> <input type="number"
									class="form-control" id="mobile" placeholder="Mobile Number">
							</div>
							<div class="checkbox">
								<label><input type="checkbox" value="">I accept
									the following terms and conditions </label>
							</div>
							<div>
								<button type="Submit" class="btn btn-primary col-xs-12">Submit</button>
							</div>
							</form>
					</div>

				</div>
			</div>
			</div>

		</div>
</body>
</html>
