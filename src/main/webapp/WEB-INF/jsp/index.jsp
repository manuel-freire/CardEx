<%@ include file="../jspf/header2.jspf" %>
<div class="container">
		<div class="zona-info col-sm-6">
			<h3 class="center">Ponte en contacto con otros jugadores</h3>
			<img src="static/img/intercambio.png" class="logo-intercambio">
			<h3 class="center">Intercambia tus cartas<br> Magic: The Gathering</h3>
			<a href="info"><br><h4 class="center">M&aacute;s informaci&oacute;n</h4></a>
		</div>

		<div class="zona-registro col-sm-6">
			<h3> �A�n no tienes cuenta? Reg�strate.</h3>
			<div class="form-group">
				<form action="register" method="post">
					<label for="nameform">Nombre</label>
					<input id="nameform" class="form-control" name="nombre">
					<label for="surnameform">Apellidos</label>
					<input id="surnameform" class="form-control" name="apellidos">
					<label for="mailform">E-Mail</label>
					<input id="mailform" class="form-control">
					<label for="usernameform">Nombre de usuario</label>
					<input id="usernameform" class="form-control">
					<label for="passform">Contrase�a</label>
					<input id="passform" class="form-control">
					<label for="repassform">Confirmar contrase�a</label>
					<input id="repassform" class="form-control">
					<label for="provform">Provincia</label>
					<select id="provform" class="form-control">
						<option>A Coru�a</option>
						<option>�lava</option>
						<option>Albacete</option>
						<option>Alicante</option>
						<option>Almer�a</option>
						<option>Asturias</option>
						<option>�vila</option>
						<option>Badajoz</option>
						<option>Baleares</option>
						<option>Barcelona</option>
						<option>Burgos</option>
						<option>C�ceres</option>
						<option>C�diz</option>
						<option>Cantabria</option>
						<option>Castell�n</option>
						<option>Ciudad Real</option>
						<option>C�rdoba</option>
						<option>Cuenca</option>
						<option>Girona</option>
						<option>Granada</option>
						<option>Guadalajara</option>
						<option>Gipuzkoa</option>
						<option>Huelva</option>
						<option>Huesca</option>
						<option>Ja�n</option>
						<option>La Rioja</option>
						<option>Las Palmas</option>
						<option>Le�n</option>
						<option>L�rida</option>
						<option>Lugo</option>
						<option>Madrid</option>
						<option>M�laga</option>
						<option>Murcia</option>
						<option>Navarra</option>
						<option>Orense</option>
						<option>Palencia</option>
						<option>Pontevedra</option>
						<option>Salamanca</option>
						<option>Segovia</option>
						<option>Sevilla</option>
						<option>Soria</option>
						<option>Tarragona</option>
						<option>Santa Cruz de Tenerife</option>
						<option>Teruel</option>
						<option>Toledo</option>
						<option>Valencia</option>
						<option>Valladolid</option>
						<option>Vizcaya</option>
						<option>Zamora</option>
						<option>Zaragoza</option>
					</select>
					<button type="submit" class="btn btn-default right">Registrar</button>
				</form>
			</div>

		</div>
</div>			<!-- /.container -->
<%@ include file="../jspf/footer.jspf" %>