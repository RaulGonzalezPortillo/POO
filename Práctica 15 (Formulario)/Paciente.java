public class Paciente
{
  private String ApellidoPaternoMedico, ApellidoMaternoMedico, NombresMedico, ApellidoPaternoPaciente, ApellidoMaternoPaciente, NombresPaciente, Sexo, Calle,
  Delegacion, CodigoPostal, TelefonoFijo, TelefonoMovil, EntidadOrigen, EstadoCivil, SabeLeer, SabeEscribir, Ocupacion, Religion;
  private int DiaConsulta, MesConsulta, AñoConsulta, DiaNacimiento, MesNacimiento, AñoNacimiento, Edad, NumeroExterior, NumeroInterior, Zona, AñosVividos,
  MesesVividos, NivelEstudios;

  public Paciente(String ApellidoPaternoMedico, String ApellidoMaternoMedico, String NombresMedico, int DiaConsulta, int MesConsulta, int AñoConsulta, String ApellidoPaternoPaciente,
  String ApellidoMaternoPaciente, String NombresPaciente, String Sexo, int DiaNacimiento, int MesNacimiento, int AñoNacimiento, int Edad, String Calle, int NumeroExterior,
  int NumeroInterior, int Zona, String Delegacion, String CodigoPostal, String TelefonoFijo, String TelefonoMovil, int AñosVividos, int MesesVividos, String EntidadOrigen,
  String EstadoCivil, int NivelEstudios, String SabeLeer, String SabeEscribir, String Ocupacion, String Religion)
  {
    this.ApellidoPaternoMedico = ApellidoPaternoMedico;
    this.ApellidoMaternoMedico = ApellidoMaternoMedico;
    this.NombresMedico = NombresMedico;
    this.DiaConsulta = DiaConsulta;
    this.MesConsulta = MesConsulta;
    this.AñoConsulta = AñoConsulta;
    this.ApellidoPaternoPaciente = ApellidoPaternoPaciente;
    this.ApellidoMaternoPaciente = ApellidoMaternoPaciente;
    this.NombresPaciente = NombresPaciente;
    this.Sexo = Sexo;
    this.DiaNacimiento = DiaNacimiento;
    this.MesNacimiento = MesNacimiento;
    this.AñoNacimiento = AñoNacimiento;
    this.Edad = Edad;
    this.Calle = Calle;
    this.NumeroExterior = NumeroExterior;
    this.NumeroInterior = NumeroInterior;
    this.Zona = Zona;
    this.Delegacion = Delegacion;
    this.CodigoPostal = CodigoPostal;
    this.TelefonoFijo = TelefonoFijo;
    this.TelefonoMovil = TelefonoMovil;
    this.AñosVividos = AñosVividos;
    this.MesesVividos = MesesVividos;
    this.EntidadOrigen = EntidadOrigen;
    this.EstadoCivil = EstadoCivil;
    this.NivelEstudios = NivelEstudios;
    this.SabeLeer = SabeLeer;
    this.SabeEscribir = SabeEscribir;
    this.Ocupacion = Ocupacion;
    this.Religion = Religion;
  }
  public String Impresion()
  {
    return "Nombre Médico: " + NombresMedico + " " + ApellidoPaternoMedico + " " + ApellidoMaternoMedico + "\nFecha de evaluación: " + DiaConsulta + "/" + MesConsulta + "/" +
    AñoConsulta + "\nNombre Paciente: " + NombresPaciente + " " + ApellidoPaternoPaciente + " " + ApellidoMaternoPaciente + "\nSéxo: " + Sexo + "\nFecha de nacimiento: " +
    DiaNacimiento + "/" + MesNacimiento + "/" + AñoNacimiento + "\nEdad: " + Edad + "\nDirección: " + Calle + " # Ext.: " + NumeroExterior + ", # Int.: " + NumeroInterior +
    ", Zona: " + Zona + ", Delegación: " + Delegacion + "\nCódigo postal: " + CodigoPostal + "\nTeléfono fijo: " + TelefonoFijo + "\nTeléfono móvil: " + TelefonoMovil +
    "\nTiempo vivido en último domicilio: " + AñosVividos + " Año(s), " + MesesVividos + " Mes(es)" + "\nEntidad de origen: " + EntidadOrigen + "\nEstado Civil: " + EstadoCivil +
    "\nNivel de estudio (en años): " + NivelEstudios + "\nSabe leer: " + SabeLeer + "\nSabe escribir: " + SabeEscribir + "\nOcupación: " + Ocupacion + "\nReligión: " + Religion + "\n";
  }
}
