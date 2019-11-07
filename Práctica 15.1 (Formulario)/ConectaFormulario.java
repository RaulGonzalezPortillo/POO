import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;

public class ConectaFormulario
{
  //clase que me permite realizar la conexión y las consultas SQL;
	static Connection conn;
	//Java Database Connectivity (JDBC) Permite a un programa en java, conectarse a un sistema manejador de base de datos y generar consultas SQL.
	static final String driver = "com.mysql.jdbc.Driver";
	//Parámetros para entrar al servidor;
	static final String user = "root";
	static final String password = "d2Qy2H;YJ";
	//nombre de la base de datos a conectar;
	static final String url = "jdbc:mysql://localhost/test2?useSSL=false";
	static ResultSet UltimoSet;
	static int UltimoID;

  public ConectaFormulario()
	{
		conn = null;
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			//Se avisa de la conexión exitosa
			JOptionPane.showMessageDialog(null,"Conexión exitosa","Estádo de conexión",JOptionPane.INFORMATION_MESSAGE);
			if(conn != null)
				System.out.println("Conexión exitosa");
		}
		//Error en el driver;
		catch(ClassNotFoundException e)
		{
			System.out.println("Error al cargar el controlador.");
			e.printStackTrace();
		}
		//Error de conexión;
		catch(SQLException e)
		{
			System.out.println("No se conectó");
		}
	}
	//Método a llamar en main para hacer la conexión;
	public Connection getConnection()
	{
		return conn;
	}
	//Terminar la conexión a BD;
	public void DesConnection()
	{
		conn = null;
		if(conn == null)
		{
			System.out.println("Terminar conexión");
		}
	}
	public void SubirFormulario()
  {
    try
    {
      PreparedStatement MedicoPreparado = conn.prepareStatement("INSERT INTO Medicos VALUES(null,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
			MedicoPreparado.setString(1, ManejadorFormulario.ApellidoPaternoMedico);
			MedicoPreparado.setString(2, ManejadorFormulario.ApellidoMaternoMedico);
			MedicoPreparado.setString(3, ManejadorFormulario.NombresMedico);
			MedicoPreparado.executeUpdate();
			UltimoSet = MedicoPreparado.getGeneratedKeys();
			if(UltimoSet != null && UltimoSet.next())
				UltimoID = UltimoSet.getInt(1);

      PreparedStatement PacientePreparado = conn.prepareStatement("INSERT INTO Pacientes VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PacientePreparado.setInt(1, UltimoID);
			PacientePreparado.setString(2, ManejadorFormulario.FechaConsulta);
			PacientePreparado.setString(3, ManejadorFormulario.ApellidoPaternoPaciente);
			PacientePreparado.setString(4, ManejadorFormulario.ApellidoMaternoPaciente);
			PacientePreparado.setString(5, ManejadorFormulario.NombresPaciente);
			PacientePreparado.setString(6, ManejadorFormulario.Sexo);
			PacientePreparado.setString(7, ManejadorFormulario.FechaNacimiento);
			PacientePreparado.setInt(8, ManejadorFormulario.Edad);
			PacientePreparado.setString(9, ManejadorFormulario.TelefonoFijo);
			PacientePreparado.setString(10, ManejadorFormulario.TelefonoMovil);
			PacientePreparado.setString(11, ManejadorFormulario.EntidadOrigen);
			PacientePreparado.setString(12, ManejadorFormulario.EstadoCivil);
			PacientePreparado.setInt(13, ManejadorFormulario.NivelEstudios);
			PacientePreparado.setString(14, ManejadorFormulario.SabeLeer);
			PacientePreparado.setString(15, ManejadorFormulario.SabeEscribir);
			PacientePreparado.setString(16, ManejadorFormulario.Ocupacion);
			PacientePreparado.setString(17, ManejadorFormulario.Religion);
			PacientePreparado.setString(18, ManejadorFormulario.Calle);
			PacientePreparado.setInt(19, ManejadorFormulario.NumeroExterior);
			PacientePreparado.setInt(20, ManejadorFormulario.NumeroInterior);
			PacientePreparado.setInt(21, ManejadorFormulario.Zona);
			PacientePreparado.setString(22, ManejadorFormulario.Delegacion);
			PacientePreparado.setString(23, ManejadorFormulario.CodigoPostal);
			PacientePreparado.setInt(24, ManejadorFormulario.AñosVividos);
			PacientePreparado.setInt(25, ManejadorFormulario.MesesVividos);
			PacientePreparado.executeUpdate();
    }
    catch(SQLException E)
    {
      System.out.println(E.getMessage());
    }
  }
}
