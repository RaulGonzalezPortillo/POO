import java.util.Date;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManejadorFormulario implements ActionListener
{
  static int Edad, DiaConsulta, MesConsulta, AñoConsulta ,DiaNacimiento, MesNacimiento, AñoNacimiento, NumeroExterior, NumeroInterior, Zona, MesesVividos,
  AñosVividos, NivelEstudios;
  static String ApellidoPaternoMedico, ApellidoMaternoMedico, NombresMedico, ApellidoPaternoPaciente, ApellidoMaternoPaciente, NombresPaciente, Delegacion,
  EntidadOrigen, CodigoPostal, TelefonoFijo, TelefonoMovil, Sexo, Calle, EstadoCivil, SabeLeer, SabeEscribir, Ocupacion, Religion, FechaConsulta,
  FechaNacimiento;
  ConectaFormulario Conexion = new ConectaFormulario();
  public void actionPerformed(ActionEvent Evento)
  {
    if (Evento.getSource() == EntradasFormulario.BotonGuardar)
    {
      try
      {
        int Error = 0;
        ApellidoPaternoMedico = EntradasFormulario.CuadroApellidoPaternoMedico.getText().toString();
        ApellidoMaternoMedico = EntradasFormulario.CuadroApellidoMaternoMedico.getText().toString();
        NombresMedico = EntradasFormulario.CuadroNombresMedico.getText().toString();
        ApellidoPaternoPaciente = EntradasFormulario.CuadroApellidoPaternoPaciente.getText().toString();
        ApellidoMaternoPaciente = EntradasFormulario.CuadroApellidoMaternoPaciente.getText().toString();
        NombresPaciente = EntradasFormulario.CuadroNombresPaciente.getText().toString();
        Delegacion = EntradasFormulario.CuadroDelegacion.getText().toString();
        CodigoPostal = EntradasFormulario.CuadroCodigoPostal.getText().toString();
        TelefonoFijo = EntradasFormulario.CuadroTelefonoFijo.getText().toString();
        TelefonoMovil = EntradasFormulario.CuadroTelefonoMovil.getText().toString();
        EntidadOrigen = EntradasFormulario.CuadroEntidadOrigen.getText().toString();

        if(ApellidoPaternoMedico.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Apellido Paterno del médico", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(ApellidoMaternoMedico.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Apellido Materno del médico", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(NombresMedico.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Nombre del médico", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(ApellidoPaternoPaciente.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Apellido Paterno del paciente", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(ApellidoMaternoPaciente.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Apellido Materno del paciente", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(NombresPaciente.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del nombre del paciente", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(Delegacion.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo de la delegación", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(CodigoPostal.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Código Postal", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(TelefonoFijo.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Teléfono Fijo", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(TelefonoMovil.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo del Teléfono móvil", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(EntidadOrigen.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo de la entidad de origen", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(ApellidoPaternoMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(ApellidoMaternoMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(NombresMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(ApellidoPaternoPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(ApellidoMaternoPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(NombresPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(Delegacion) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, La delegación sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionNumerica(CodigoPostal) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El código postal sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionNumerica(TelefonoFijo) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El teléfono fijo sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionNumerica(TelefonoMovil) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El teléfono móvil sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        if(VerificacionAlfabetica(EntidadOrigen) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, La entidad de origen sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        DiaConsulta = Integer.parseInt(EntradasFormulario.CuadroDiaConsulta.getText().toString());
        MesConsulta = Integer.parseInt(EntradasFormulario.CuadroMesConsulta.getText().toString());
        AñoConsulta = Integer.parseInt(EntradasFormulario.CuadroAñoConsulta.getText().toString());
        DiaNacimiento = Integer.parseInt(EntradasFormulario.CuadroDiaNacimiento.getText().toString());
        MesNacimiento = Integer.parseInt(EntradasFormulario.CuadroMesNacimiento.getText().toString());
        AñoNacimiento = Integer.parseInt(EntradasFormulario.CuadroAñoNacimiento.getText().toString());

        if(VerificacionFecha(DiaConsulta, MesConsulta, AñoConsulta) == 0)
        {
          JOptionPane.showMessageDialog(null, "Error, Fecha de consulta inválida", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }
        else
        {
          if(VerificacionFecha(DiaNacimiento, MesNacimiento, AñoNacimiento) == 0)
          {
            JOptionPane.showMessageDialog(null, "Error, Fecha de nacimiento inválida", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            Error = 1;
            return;
          }
          else
          {
            Edad = CalcularEdad(DiaConsulta, MesConsulta, AñoConsulta, DiaNacimiento, MesNacimiento, AñoNacimiento);
            if(Edad < 65)
            {
              JOptionPane.showMessageDialog(null, "Error, Sólo se aceptan registros de adultos mayores (65 años en adelante)", "Error de entrada", JOptionPane.ERROR_MESSAGE);
              Error = 1;
              return;
            }
          }
        }

        Sexo = EntradasFormulario.GrupoSexo.getSelection().getActionCommand();

        Calle = EntradasFormulario.CuadroCalle.getText().toString();

        if(Calle.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Error, Asegurese de llenar el campo de la calle", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
          return;
        }

        NumeroExterior = Integer.parseInt(EntradasFormulario.CuadroNumeroExterior.getText().toString());
        NumeroInterior = Integer.parseInt(EntradasFormulario.CuadroNumeroInterior.getText().toString());
        Zona = Integer.parseInt(EntradasFormulario.CuadroZona.getText().toString());
        AñosVividos = Integer.parseInt(EntradasFormulario.CuadroAñosVividos.getText().toString());
        MesesVividos = Integer.parseInt(EntradasFormulario.CuadroMesesVividos.getText().toString());
        EstadoCivil = EntradasFormulario.GrupoEstadoCivil.getSelection().getActionCommand();

        NivelEstudios = Integer.parseInt(EntradasFormulario.GrupoNivelEstudios.getSelection().getActionCommand());
        SabeLeer = EntradasFormulario.GrupoSabeLeer.getSelection().getActionCommand();
        SabeEscribir = EntradasFormulario.GrupoSabeEscribir.getSelection().getActionCommand();

        if(NivelEstudios > 0)
        {
          if(SabeLeer.equals("No") || SabeEscribir.equals("No"))
          {
            JOptionPane.showMessageDialog(null, "Error, Es necesario que sepa leer y escribir para tener el nivel de estudios seleccionado", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            Error = 1;
            return;
          }
        }

        Ocupacion = EntradasFormulario.GrupoOcupacion.getSelection().getActionCommand();
        Religion = EntradasFormulario.GrupoReligion.getSelection().getActionCommand();

        if (Error == 0)
        {
          EntradasFormulario.LabelEdadCalculada.setText("" + Edad);
          FechaConsulta = AñoConsulta + "-" + MesConsulta + "-" + DiaConsulta;
          FechaNacimiento = AñoNacimiento + "-" + MesNacimiento + "-" + DiaNacimiento;
          Conexion.getConnection();
          Conexion.SubirFormulario();
          JOptionPane.showMessageDialog(null, "Datos agregados correctamente","Estádo de la base", JOptionPane.INFORMATION_MESSAGE);
        }
      }
      catch(Exception E)
      {
        JOptionPane.showMessageDialog(null, "Error: Revise que todos los campos están llenados correctamente", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  public int VerificacionAlfabetica(String Cadena)
  {
    if(Pattern.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+", Cadena))
      return 1;
    else
      return 0;
  }
  public int VerificacionNumerica(String Cadena)
  {
    if(Pattern.matches("[0-9]+", Cadena))
      return 1;
    else
      return 0;
  }
  public int VerificacionFecha(int Dia, int Mes, int Año) //1 = Correcto
  {
    if(Año >= 1900 && Año <= 2100)
      if(Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12)
        if(Dia >= 1 && Dia <= 31)
          return 1;
        else
          return 0;
      else
        if(Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11)
          if(Dia >= 1 && Dia <= 30)
            return 1;
          else
            return 0;
        else
          if(Mes == 2)
            if(Dia >= 1 && Dia <= 29)
              return 1;
            else
              return 0;
          else
            return 0;
    else
      return 0;
  }
  public int CalcularEdad(int DiaConsulta, int MesConsulta, int AñoConsulta, int DiaNacimiento, int MesNacimiento, int AñoNacimiento)
  {
    if(MesConsulta > MesNacimiento)
      return AñoConsulta - AñoNacimiento;
    else
      if(MesConsulta == MesNacimiento)
        if(DiaConsulta >= DiaNacimiento)
          return AñoConsulta - AñoNacimiento;
        else
          return AñoConsulta - AñoNacimiento - 1;
      else
        return AñoConsulta - AñoNacimiento - 1;
  }
}
