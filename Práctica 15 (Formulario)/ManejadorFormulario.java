import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.File;

public class ManejadorFormulario implements ActionListener
{
  static int Edad;
  ArrayList<Paciente> ArregloPacientes = new ArrayList<Paciente>();
  public void actionPerformed(ActionEvent Evento)
  {
    if (Evento.getSource() == EntradasFormulario.BotonGuardar)
    {
      try
      {
        int Error = 0;
        String ApellidoPaternoMedico = EntradasFormulario.CuadroApellidoPaternoMedico.getText().toString();
        String ApellidoMaternoMedico = EntradasFormulario.CuadroApellidoMaternoMedico.getText().toString();
        String NombresMedico = EntradasFormulario.CuadroNombresMedico.getText().toString();
        String ApellidoPaternoPaciente = EntradasFormulario.CuadroApellidoPaternoPaciente.getText().toString();
        String ApellidoMaternoPaciente = EntradasFormulario.CuadroApellidoMaternoPaciente.getText().toString();
        String NombresPaciente = EntradasFormulario.CuadroNombresPaciente.getText().toString();
        String Delegacion = EntradasFormulario.CuadroDelegacion.getText().toString();
        String EntidadOrigen = EntradasFormulario.CuadroEntidadOrigen.getText().toString();
        String CodigoPostal = EntradasFormulario.CuadroCodigoPostal.getText().toString();
        String TelefonoFijo = EntradasFormulario.CuadroTelefonoFijo.getText().toString();
        String TelefonoMovil = EntradasFormulario.CuadroTelefonoMovil.getText().toString();

        if(VerificacionAlfabetica(ApellidoPaternoMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(ApellidoMaternoMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(NombresMedico) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del médico sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(ApellidoPaternoPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(ApellidoMaternoPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(NombresPaciente) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El nombre del paciente sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(Delegacion) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, La delegación sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionAlfabetica(EntidadOrigen) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, La entidad de origen sólo puede contener letras", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionNumerica(CodigoPostal) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El código postal sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionNumerica(TelefonoFijo) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El teléfono fijo sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        if(VerificacionNumerica(TelefonoMovil) ==  0)
        {
          JOptionPane.showMessageDialog(null, "Error, El teléfono móvil sólo puede contener números", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }

        int DiaConsulta = Integer.parseInt(EntradasFormulario.CuadroDiaConsulta.getText().toString());
        int MesConsulta = Integer.parseInt(EntradasFormulario.CuadroMesConsulta.getText().toString());
        int AñoConsulta = Integer.parseInt(EntradasFormulario.CuadroAñoConsulta.getText().toString());
        int DiaNacimiento = Integer.parseInt(EntradasFormulario.CuadroDiaNacimiento.getText().toString());
        int MesNacimiento = Integer.parseInt(EntradasFormulario.CuadroMesNacimiento.getText().toString());
        int AñoNacimiento = Integer.parseInt(EntradasFormulario.CuadroAñoNacimiento.getText().toString());

        if(VerificacionFecha(DiaConsulta, MesConsulta, AñoConsulta) == 0)
        {
          JOptionPane.showMessageDialog(null, "Error, Fecha de consulta inválida", "Error de entrada", JOptionPane.ERROR_MESSAGE);
          Error = 1;
        }
        else
        {
          if(VerificacionFecha(DiaNacimiento, MesNacimiento, AñoNacimiento) == 0)
          {
            JOptionPane.showMessageDialog(null, "Error, Fecha de nacimiento inválida", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            Error = 1;
          }
        }

        if(Error == 0)
        {
          Edad = CalcularEdad(DiaConsulta, MesConsulta, AñoConsulta, DiaNacimiento, MesNacimiento, AñoNacimiento);
        }

        String Sexo = EntradasFormulario.GrupoSexo.getSelection().getActionCommand();
        String Calle = EntradasFormulario.CuadroCalle.getText().toString();
        int NumeroExterior = Integer.parseInt(EntradasFormulario.CuadroNumeroExterior.getText().toString());
        int NumeroInterior = Integer.parseInt(EntradasFormulario.CuadroNumeroInterior.getText().toString());
        int Zona = Integer.parseInt(EntradasFormulario.CuadroZona.getText().toString());
        int MesesVividos = Integer.parseInt(EntradasFormulario.CuadroMesesVividos.getText().toString());
        int AñosVividos = Integer.parseInt(EntradasFormulario.CuadroAñosVividos.getText().toString());
        String EstadoCivil = EntradasFormulario.GrupoEstadoCivil.getSelection().getActionCommand();
        int NivelEstudios = Integer.parseInt(EntradasFormulario.GrupoNivelEstudios.getSelection().getActionCommand());
        String SabeLeer = EntradasFormulario.GrupoSabeLeer.getSelection().getActionCommand();
        String SabeEscribir = EntradasFormulario.GrupoSabeEscribir.getSelection().getActionCommand();
        String Ocupacion = EntradasFormulario.GrupoOcupacion.getSelection().getActionCommand();
        String Religion = EntradasFormulario.GrupoReligion.getSelection().getActionCommand();

        if (Error == 0)
        {
          EntradasFormulario.LabelEdadCalculada.setText("" + Edad);
          ArregloPacientes.add(new Paciente(ApellidoPaternoMedico, ApellidoMaternoMedico, NombresMedico, DiaConsulta, MesConsulta, AñoConsulta, ApellidoPaternoPaciente,
          ApellidoMaternoPaciente, NombresPaciente, Sexo, DiaNacimiento, MesNacimiento, AñoNacimiento, Edad, Calle, NumeroExterior, NumeroInterior, Zona, Delegacion,
          CodigoPostal, TelefonoFijo, TelefonoMovil, AñosVividos, MesesVividos, EntidadOrigen, EstadoCivil, NivelEstudios, SabeLeer, SabeEscribir, Ocupacion, Religion));
          PrintWriter pw = new PrintWriter("Salida.txt");
          for(int i = 0; i < ArregloPacientes.size(); i++)
          {
            System.out.println("Paciente: " + (i + 1));
            pw.println("Paciente: " + (i + 1));
            System.out.println(ArregloPacientes.get(i).Impresion());
            pw.println(ArregloPacientes.get(i).Impresion());
          }
          pw.close();
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
  public int VerificacionFecha(int Dia, int Mes, int Año)
  {
    if(Dia >= 1 && Dia <= 31 && Mes >= 1 && Mes <= 12 && Año >= 1900 && Año <= 2100)
      return 1;
    else
      return 0;
  }
  public int CalcularEdad(int DiaConsulta, int MesConsulta, int AñoConsulta, int DiaNacimiento, int MesNacimiento, int AñoNacimiento)
  {
    if(MesConsulta > MesNacimiento)
      return AñoConsulta - AñoNacimiento;
    else
    {
      if(MesConsulta == MesNacimiento)
      {
        if(DiaConsulta >= DiaNacimiento)
          return AñoConsulta - AñoNacimiento;
        else
          return AñoConsulta - AñoNacimiento - 1;
      }
      else
        return AñoConsulta - AñoNacimiento - 1;
    }
  }
}
