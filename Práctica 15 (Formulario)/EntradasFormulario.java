import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EntradasFormulario extends JPanel
{
  static JTextField CuadroApellidoPaternoMedico, CuadroApellidoMaternoMedico, CuadroNombresMedico, CuadroDiaConsulta, CuadroMesConsulta, CuadroAñoConsulta,
  CuadroApellidoPaternoPaciente, CuadroApellidoMaternoPaciente, CuadroNombresPaciente, CuadroDiaNacimiento, CuadroMesNacimiento, CuadroAñoNacimiento,
  CuadroCalle, CuadroNumeroExterior, CuadroNumeroInterior, CuadroZona, CuadroDelegacion, CuadroCodigoPostal, CuadroTelefonoFijo, CuadroTelefonoMovil,
  CuadroAñosVividos, CuadroMesesVividos, CuadroEntidadOrigen;
  static JLabel LabelEdadCalculada;
  static JRadioButton BotonHombre, BotonMujer, BotonCasado, BotonUnionLibre, BotonSoltero, BotonSeparado, BotonDivorciado, BotonViudo, BotonNoSabe,
  Boton0, Boton1, Boton2, Boton3, Boton4, Boton5, Boton6, Boton7, Boton8, Boton9, Boton10, Boton11, Boton12, Boton13, Boton14, Boton15, Boton16,
  Boton17, Boton18, Boton19, Boton20, Boton21, Boton22, Boton23, Boton24, Boton25Mas, BotonSiSabeLeer, BotonNoSabeLeer, BotonSiSabeEscribir,
  BotonNoSabeEscribir, BotonDesempleado, BotonJubiladoSinPension, BotonJubiladoConPension, BotonProfesionista, BotonPatron, BotonAmaDeCasa,
  BotonNinguna, BotonCatolica, BotonCristiana, BotonJudio;
  static JButton BotonGuardar;
  static ButtonGroup GrupoSexo, GrupoEstadoCivil, GrupoNivelEstudios, GrupoSabeLeer, GrupoSabeEscribir, GrupoOcupacion, GrupoReligion;
  EntradasFormulario()
  {
    JLabel LabelTituloA, LabelNombreMedico, LabelFechaEvaluacion, LabelDiagonal1, LabelDiagonal2, LabelApellidoPaternoMedico,
    LabelApellidoMaternoMedico, LabelNombresMedico, LabelDiaConsulta, LabelMesConsulta, LabelAñoConsulta, LabelTituloB, LabelNombrePaciente,
    LabelSexo, LabelHombre, LabelMujer, LabelFechaNacimiento, LabelDiaNacimiento, LabelMesNacimiento, LabelAñoNacimiento, LabelEdad, LabelDiagonal3,
    LabelDiagonal4, LabelApellidoPaternoPaciente, LabelApellidoMaternoPaciente, LabelNombresPaciente, LabelDireccion, LabelCalle, LabelNumeroExterior,
    LabelNumeroInterior, LabelZona, LabelDelegacion, LabelCodigoPostal, LabelContacto, LabelTelefonoFijo, LabelTelefonoMovil, LabelTiempoVivido,
    LabelAñosVividos, LabelMesesVividos, LabelEntidadOrigen, LabelEstadoCivil, LabelNivelEstudios, LabelNA, LabelPrimaria, LabelSecundaria,
    LabelPreparatoria, LabelLicenciatura, LabelPostgrado, LabelSabeLeer, LabelSabeEscribir, LabelDedicacion, LabelReligion;
    Icon IconoTituloA, IconoTituloB;
    setLayout(null);

    LabelTituloA = new JLabel();
    IconoTituloA = new ImageIcon(getClass().getResource("TituloA.png"));
    LabelTituloA.setIcon(IconoTituloA);
    LabelTituloA.setBounds(25, 25, 1175, 50);
    add(LabelTituloA);

    LabelNombreMedico = new JLabel("Nombre del médico y / o nutriólogo:");
    LabelNombreMedico.setBounds(25, 100, 250, 25);
    add(LabelNombreMedico);

    CuadroApellidoPaternoMedico = new JTextField("", 1);
    CuadroApellidoPaternoMedico.setBounds(280, 100, 158, 25);
    add(CuadroApellidoPaternoMedico);

    CuadroApellidoMaternoMedico = new JTextField("", 1);
    CuadroApellidoMaternoMedico.setBounds(463, 100, 158, 25);
    add(CuadroApellidoMaternoMedico);

    CuadroNombresMedico = new JTextField("", 1);
    CuadroNombresMedico.setBounds(646, 100, 158, 25);
    add(CuadroNombresMedico);

    LabelFechaEvaluacion = new JLabel("Fecha de evaluación:");
    LabelFechaEvaluacion.setBounds(825, 100, 150, 25);
    add(LabelFechaEvaluacion);

    CuadroDiaConsulta = new JTextField("", 1);
    CuadroDiaConsulta.setBounds(975, 100, 50, 25);
    add(CuadroDiaConsulta);

    LabelDiagonal1 = new JLabel("/");
    LabelDiagonal1.setBounds(1037, 100, 25, 25);
    add(LabelDiagonal1);

    CuadroMesConsulta = new JTextField("", 1);
    CuadroMesConsulta.setBounds(1050, 100, 50, 25);
    add(CuadroMesConsulta);

    LabelDiagonal2 = new JLabel("/");
    LabelDiagonal2.setBounds(1112, 100, 25, 25);
    add(LabelDiagonal2);

    CuadroAñoConsulta = new JTextField("", 1);
    CuadroAñoConsulta.setBounds(1125, 100, 50, 25);
    add(CuadroAñoConsulta);

    LabelApellidoPaternoMedico = new JLabel("Apellido Paterno");
    LabelApellidoPaternoMedico.setBounds(280, 125, 158, 25);
    add(LabelApellidoPaternoMedico);

    LabelApellidoMaternoMedico = new JLabel("Apellido Materno");
    LabelApellidoMaternoMedico.setBounds(463, 125, 158, 25);
    add(LabelApellidoMaternoMedico);

    LabelNombresMedico = new JLabel("Nombre(s)");
    LabelNombresMedico.setBounds(646, 125, 158, 25);
    add(LabelNombresMedico);

    LabelDiaConsulta = new JLabel("dd");
    LabelDiaConsulta.setBounds(975, 125, 50, 25);
    add(LabelDiaConsulta);

    LabelMesConsulta = new JLabel("mm");
    LabelMesConsulta.setBounds(1050, 125, 50, 25);
    add(LabelMesConsulta);

    LabelAñoConsulta = new JLabel("aaaa");
    LabelAñoConsulta.setBounds(1125, 125, 50, 25);
    add(LabelAñoConsulta);

    LabelTituloB = new JLabel();
    IconoTituloB = new ImageIcon(getClass().getResource("TituloB.png"));
    LabelTituloB.setIcon(IconoTituloB);
    LabelTituloB.setBounds(25, 150, 1175, 50);
    add(LabelTituloB);

    LabelNombrePaciente = new JLabel("Nombre:");
    LabelNombrePaciente.setBounds(25, 225, 100, 25);
    add(LabelNombrePaciente);

    CuadroApellidoPaternoPaciente = new JTextField("", 1);
    CuadroApellidoPaternoPaciente.setBounds(100, 225, 117, 25);
    add(CuadroApellidoPaternoPaciente);

    CuadroApellidoMaternoPaciente = new JTextField("", 1);
    CuadroApellidoMaternoPaciente.setBounds(242, 225, 117, 25);
    add(CuadroApellidoMaternoPaciente);

    CuadroNombresPaciente = new JTextField("", 1);
    CuadroNombresPaciente.setBounds(384, 225, 117, 25);
    add(CuadroNombresPaciente);

    LabelSexo = new JLabel("Sexo:");
    LabelSexo.setBounds(525, 225, 50, 25);
    add(LabelSexo);

    GrupoSexo = new ButtonGroup();
    BotonHombre = new JRadioButton("H");
    BotonHombre.setBounds(575, 225, 50, 25);
    BotonHombre.setActionCommand("Hombre");
    GrupoSexo.add(BotonHombre);
    add(BotonHombre);

    BotonMujer = new JRadioButton("M");
    BotonMujer.setBounds(625, 225, 50, 25);
    BotonMujer.setActionCommand("Mujer");
    GrupoSexo.add(BotonMujer);
    add(BotonMujer);

    LabelFechaNacimiento = new JLabel("Fecha de nacimiento:");
    LabelFechaNacimiento.setBounds(675, 225, 150, 25);
    add(LabelFechaNacimiento);

    CuadroDiaNacimiento = new JTextField("", 1);
    CuadroDiaNacimiento.setBounds(850, 225, 50, 25);
    add(CuadroDiaNacimiento);

    LabelDiagonal3 = new JLabel("/");
    LabelDiagonal3.setBounds(912, 225, 25, 25);
    add(LabelDiagonal3);

    CuadroMesNacimiento = new JTextField("", 1);
    CuadroMesNacimiento.setBounds(925, 225, 50, 25);
    add(CuadroMesNacimiento);

    LabelDiagonal4 = new JLabel("/");
    LabelDiagonal4.setBounds(987, 225, 25, 25);
    add(LabelDiagonal4);

    CuadroAñoNacimiento = new JTextField("", 1);
    CuadroAñoNacimiento.setBounds(1000, 225, 50, 25);
    add(CuadroAñoNacimiento);

    LabelEdad = new JLabel("Edad:");
    LabelEdad.setBounds(1075, 225, 50, 25);
    add(LabelEdad);

    LabelEdadCalculada = new JLabel("________");
    LabelEdadCalculada.setBounds(1125, 225, 50, 25);
    add(LabelEdadCalculada);

    LabelApellidoPaternoMedico = new JLabel("Apellido Paterno");
    LabelApellidoPaternoMedico.setBounds(100, 250, 158, 25);
    add(LabelApellidoPaternoMedico);

    LabelApellidoMaternoMedico = new JLabel("Apellido Materno");
    LabelApellidoMaternoMedico.setBounds(242, 250, 158, 25);
    add(LabelApellidoMaternoMedico);

    LabelNombresPaciente = new JLabel("Nombre(s)");
    LabelNombresPaciente.setBounds(384, 250, 158, 25);
    add(LabelNombresPaciente);

    LabelDiaNacimiento = new JLabel("dd");
    LabelDiaNacimiento.setBounds(850, 250, 50, 25);
    add(LabelDiaNacimiento);

    LabelMesNacimiento = new JLabel("mm");
    LabelMesNacimiento.setBounds(925, 250, 50, 25);
    add(LabelMesNacimiento);

    LabelAñoNacimiento = new JLabel("aaaa");
    LabelAñoNacimiento.setBounds(1000, 250, 50, 25);
    add(LabelAñoNacimiento);

    LabelDireccion = new JLabel("Dirección:");
    LabelDireccion.setBounds(25, 285, 75, 25);
    add(LabelDireccion);

    LabelCalle = new JLabel("Calle:");
    LabelCalle.setBounds(25, 310, 40, 25);
    add(LabelCalle);

    CuadroCalle = new JTextField("", 1);
    CuadroCalle.setBounds(75, 310, 175, 25);
    add(CuadroCalle);

    LabelNumeroExterior = new JLabel("N. ext.:");
    LabelNumeroExterior.setBounds(275, 310, 60, 25);
    add(LabelNumeroExterior);

    CuadroNumeroExterior = new JTextField("", 1);
    CuadroNumeroExterior.setBounds(335, 310, 65, 25);
    add(CuadroNumeroExterior);

    LabelNumeroInterior = new JLabel("N. int.:");
    LabelNumeroInterior.setBounds(425, 310, 60, 25);
    add(LabelNumeroInterior);

    CuadroNumeroInterior = new JTextField("", 1);
    CuadroNumeroInterior.setBounds(485, 310, 65, 25);
    add(CuadroNumeroInterior);

    LabelZona = new JLabel("Zona:");
    LabelZona.setBounds(575, 310, 50, 25);
    add(LabelZona);

    CuadroZona = new JTextField("", 1);
    CuadroZona.setBounds(625, 310, 65, 25);
    add(CuadroZona);

    LabelDelegacion = new JLabel("Del. / Municipio:");
    LabelDelegacion.setBounds(715, 310, 145, 25);
    add(LabelDelegacion);

    CuadroDelegacion = new JTextField("", 1);
    CuadroDelegacion.setBounds(840, 310, 185, 25);
    add(CuadroDelegacion);

    LabelCodigoPostal = new JLabel("C. P.:");
    LabelCodigoPostal.setBounds(1050, 310, 50, 25);
    add(LabelCodigoPostal);

    CuadroCodigoPostal = new JTextField("", 1);
    CuadroCodigoPostal.setBounds(1100, 310, 75, 25);
    add(CuadroCodigoPostal);

    LabelContacto = new JLabel("Contacto:");
    LabelContacto.setBounds(25, 345, 75, 25);
    add(LabelContacto);

    LabelTiempoVivido = new JLabel("Tiempo vivido en el domicilio:");
    LabelTiempoVivido.setBounds(545, 345, 225, 25);
    add(LabelTiempoVivido);

    LabelTiempoVivido = new JLabel("Entidad federativa de origen:");
    LabelTiempoVivido.setBounds(895, 345, 225, 25);
    add(LabelTiempoVivido);

    LabelTelefonoFijo = new JLabel("Teléfono fijo:");
    LabelTelefonoFijo.setBounds(25, 370, 90, 25);
    add(LabelTelefonoFijo);

    CuadroTelefonoFijo = new JTextField("", 1);
    CuadroTelefonoFijo.setBounds(140, 370, 110, 25);
    add(CuadroTelefonoFijo);

    LabelTelefonoMovil = new JLabel("Teléfono móvil:");
    LabelTelefonoMovil.setBounds(275, 370, 110, 25);
    add(LabelTelefonoMovil);

    CuadroTelefonoMovil = new JTextField("", 1);
    CuadroTelefonoMovil.setBounds(410, 370, 110, 25);
    add(CuadroTelefonoMovil);

    LabelAñosVividos = new JLabel("Años:");
    LabelAñosVividos.setBounds(545, 370, 50, 25);
    add(LabelAñosVividos);

    CuadroAñosVividos = new JTextField("", 1);
    CuadroAñosVividos.setBounds(620, 370, 75, 25);
    add(CuadroAñosVividos);

    LabelMesesVividos = new JLabel("Meses:");
    LabelMesesVividos.setBounds(720, 370, 50, 25);
    add(LabelMesesVividos);

    CuadroMesesVividos = new JTextField("", 1);
    CuadroMesesVividos.setBounds(795, 370, 75, 25);
    add(CuadroMesesVividos);

    CuadroEntidadOrigen = new JTextField("", 1);
    CuadroEntidadOrigen.setBounds(895, 370, 280, 25);
    add(CuadroEntidadOrigen);

    LabelEstadoCivil = new JLabel("Estado civil:");
    LabelEstadoCivil.setBounds(25, 405, 85, 25);
    add(LabelEstadoCivil);

    GrupoEstadoCivil = new ButtonGroup();
    BotonCasado = new JRadioButton("Casado");
    BotonCasado.setBounds(25, 430, 75, 25);
    BotonCasado.setActionCommand("Casado");
    GrupoEstadoCivil.add(BotonCasado);
    add(BotonCasado);

    BotonUnionLibre = new JRadioButton("Unión Libre");
    BotonUnionLibre.setBounds(178, 430, 110, 25);
    BotonUnionLibre.setActionCommand("Unión Libre");
    GrupoEstadoCivil.add(BotonUnionLibre);
    add(BotonUnionLibre);

    BotonSoltero = new JRadioButton("Soltero");
    BotonSoltero.setBounds(366, 430, 80, 25);
    BotonSoltero.setActionCommand("Soltero");
    GrupoEstadoCivil.add(BotonSoltero);
    add(BotonSoltero);

    BotonSeparado = new JRadioButton("Separado");
    BotonSeparado.setBounds(524, 430, 90, 25);
    BotonSeparado.setActionCommand("Separado");
    GrupoEstadoCivil.add(BotonSeparado);
    add(BotonSeparado);

    BotonDivorciado = new JRadioButton("Divorciado");
    BotonDivorciado.setBounds(692, 430, 100, 25);
    BotonDivorciado.setActionCommand("Divorciado");
    GrupoEstadoCivil.add(BotonDivorciado);
    add(BotonDivorciado);

    BotonViudo = new JRadioButton("Viudo");
    BotonViudo.setBounds(870, 430, 70, 25);
    BotonViudo.setActionCommand("Viudo");
    GrupoEstadoCivil.add(BotonViudo);
    add(BotonViudo);

    BotonNoSabe = new JRadioButton("No sabe / responde");
    BotonNoSabe.setBounds(1018, 430, 160, 25);
    BotonNoSabe.setActionCommand("No sabe / responde");
    GrupoEstadoCivil.add(BotonNoSabe);
    add(BotonNoSabe);

    LabelEstadoCivil = new JLabel("Nivel de estudios en años:");
    LabelEstadoCivil.setBounds(25, 465, 180, 25);
    add(LabelEstadoCivil);

    LabelNA = new JLabel("NA");
    LabelNA.setBounds(25, 490, 180, 25);
    add(LabelNA);

    LabelPrimaria = new JLabel("Primaria");
    LabelPrimaria.setBounds(66, 490, 180, 25);
    add(LabelPrimaria);

    LabelSecundaria = new JLabel("Secundaria");
    LabelSecundaria.setBounds(312, 490, 180, 25);
    add(LabelSecundaria);

    LabelPreparatoria = new JLabel("Preparatoria");
    LabelPreparatoria.setBounds(435, 490, 180, 25);
    add(LabelPreparatoria);

    LabelLicenciatura = new JLabel("Licenciatura");
    LabelLicenciatura.setBounds(573, 490, 180, 25);
    add(LabelLicenciatura);

    LabelPostgrado = new JLabel("Postgrado");
    LabelPostgrado.setBounds(849, 490, 180, 25);
    add(LabelPostgrado);

    GrupoNivelEstudios = new ButtonGroup();
    Boton0 = new JRadioButton("0");
    Boton0.setBounds(25, 515, 40, 25);
    Boton0.setActionCommand("0");
    GrupoNivelEstudios.add(Boton0);
    add(Boton0);

    Boton1 = new JRadioButton("1");
    Boton1.setBounds(66, 515, 40, 25);
    Boton1.setActionCommand("1");
    GrupoNivelEstudios.add(Boton1);
    add(Boton1);

    Boton2 = new JRadioButton("2");
    Boton2.setBounds(107, 515, 40, 25);
    Boton2.setActionCommand("2");
    GrupoNivelEstudios.add(Boton2);
    add(Boton2);

    Boton3 = new JRadioButton("3");
    Boton3.setBounds(148, 515, 40, 25);
    Boton3.setActionCommand("3");
    GrupoNivelEstudios.add(Boton3);
    add(Boton3);

    Boton4 = new JRadioButton("4");
    Boton4.setBounds(189, 515, 40, 25);
    Boton4.setActionCommand("4");
    GrupoNivelEstudios.add(Boton4);
    add(Boton4);

    Boton5 = new JRadioButton("5");
    Boton5.setBounds(230, 515, 40, 25);
    Boton5.setActionCommand("5");
    GrupoNivelEstudios.add(Boton5);
    add(Boton5);

    Boton6 = new JRadioButton("6");
    Boton6.setBounds(271, 515, 40, 25);
    Boton6.setActionCommand("6");
    GrupoNivelEstudios.add(Boton6);
    add(Boton6);

    Boton7 = new JRadioButton("7");
    Boton7.setBounds(312, 515, 40, 25);
    Boton7.setActionCommand("7");
    GrupoNivelEstudios.add(Boton7);
    add(Boton7);

    Boton8 = new JRadioButton("8");
    Boton8.setBounds(353, 515, 40, 25);
    Boton8.setActionCommand("8");
    GrupoNivelEstudios.add(Boton8);
    add(Boton8);

    Boton9 = new JRadioButton("9");
    Boton9.setBounds(394, 515, 40, 25);
    Boton9.setActionCommand("9");
    GrupoNivelEstudios.add(Boton9);
    add(Boton9);

    Boton10 = new JRadioButton("10");
    Boton10.setBounds(435, 515, 45, 25);
    Boton10.setActionCommand("10");
    GrupoNivelEstudios.add(Boton10);
    add(Boton10);

    Boton11 = new JRadioButton("11");
    Boton11.setBounds(481, 515, 45, 25);
    Boton11.setActionCommand("11");
    GrupoNivelEstudios.add(Boton11);
    add(Boton11);

    Boton12 = new JRadioButton("12");
    Boton12.setBounds(527, 515, 45, 25);
    Boton12.setActionCommand("12");
    GrupoNivelEstudios.add(Boton12);
    add(Boton12);

    Boton13 = new JRadioButton("13");
    Boton13.setBounds(573, 515, 45, 25);
    Boton13.setActionCommand("13");
    GrupoNivelEstudios.add(Boton13);
    add(Boton13);

    Boton14 = new JRadioButton("14");
    Boton14.setBounds(619, 515, 45, 25);
    Boton14.setActionCommand("14");
    GrupoNivelEstudios.add(Boton14);
    add(Boton14);

    Boton15 = new JRadioButton("15");
    Boton15.setBounds(665, 515, 45, 25);
    Boton15.setActionCommand("15");
    GrupoNivelEstudios.add(Boton15);
    add(Boton15);

    Boton16 = new JRadioButton("16");
    Boton16.setBounds(711, 515, 45, 25);
    Boton16.setActionCommand("16");
    GrupoNivelEstudios.add(Boton16);
    add(Boton16);

    Boton17 = new JRadioButton("17");
    Boton17.setBounds(757, 515, 45, 25);
    Boton17.setActionCommand("17");
    GrupoNivelEstudios.add(Boton17);
    add(Boton17);

    Boton18 = new JRadioButton("18");
    Boton18.setBounds(803, 515, 45, 25);
    Boton18.setActionCommand("18");
    GrupoNivelEstudios.add(Boton18);
    add(Boton18);

    Boton19 = new JRadioButton("19");
    Boton19.setBounds(849, 515, 45, 25);
    Boton19.setActionCommand("19");
    GrupoNivelEstudios.add(Boton19);
    add(Boton19);

    Boton20 = new JRadioButton("20");
    Boton20.setBounds(895, 515, 45, 25);
    Boton20.setActionCommand("20");
    GrupoNivelEstudios.add(Boton20);
    add(Boton20);

    Boton21 = new JRadioButton("21");
    Boton21.setBounds(941, 515, 45, 25);
    Boton21.setActionCommand("21");
    GrupoNivelEstudios.add(Boton21);
    add(Boton21);

    Boton22 = new JRadioButton("22");
    Boton22.setBounds(987, 515, 45, 25);
    Boton22.setActionCommand("22");
    GrupoNivelEstudios.add(Boton22);
    add(Boton22);

    Boton23 = new JRadioButton("23");
    Boton23.setBounds(1033, 515, 45, 25);
    Boton23.setActionCommand("23");
    GrupoNivelEstudios.add(Boton23);
    add(Boton23);

    Boton24 = new JRadioButton("24");
    Boton24.setBounds(1079, 515, 45, 25);
    Boton24.setActionCommand("24");
    GrupoNivelEstudios.add(Boton24);
    add(Boton24);

    Boton25Mas = new JRadioButton("25+");
    Boton25Mas.setBounds(1125, 515, 55, 25);
    Boton25Mas.setActionCommand("25+");
    GrupoNivelEstudios.add(Boton25Mas);
    add(Boton25Mas);

    LabelSabeLeer = new JLabel("Sabe leer:");
    LabelSabeLeer.setBounds(25, 540, 70, 25);
    add(LabelSabeLeer);

    GrupoSabeLeer = new ButtonGroup();
    BotonSiSabeLeer = new JRadioButton("Sí");
    BotonSiSabeLeer.setBounds(120, 540, 45, 25);
    BotonSiSabeLeer.setActionCommand("Sí");
    GrupoSabeLeer.add(BotonSiSabeLeer);
    add(BotonSiSabeLeer);

    BotonNoSabeLeer = new JRadioButton("No");
    BotonNoSabeLeer.setBounds(190, 540, 45, 25);
    BotonNoSabeLeer.setActionCommand("No");
    GrupoSabeLeer.add(BotonNoSabeLeer);
    add(BotonNoSabeLeer);

    LabelSabeEscribir = new JLabel("Sabe escribir:");
    LabelSabeEscribir.setBounds(260, 540, 100, 25);
    add(LabelSabeEscribir);

    GrupoSabeEscribir = new ButtonGroup();
    BotonSiSabeEscribir = new JRadioButton("Sí");
    BotonSiSabeEscribir.setBounds(385, 540, 45, 25);
    BotonSiSabeEscribir.setActionCommand("Sí");
    GrupoSabeEscribir.add(BotonSiSabeEscribir);
    add(BotonSiSabeEscribir);

    BotonNoSabeEscribir = new JRadioButton("No");
    BotonNoSabeEscribir.setBounds(455, 540, 45, 25);
    BotonNoSabeEscribir.setActionCommand("No");
    GrupoSabeEscribir.add(BotonNoSabeEscribir);
    add(BotonNoSabeEscribir);

    LabelDedicacion = new JLabel("¿A qué se dedica?");
    LabelDedicacion.setBounds(25, 575, 130, 25);
    add(LabelDedicacion);

    GrupoOcupacion = new ButtonGroup();
    BotonDesempleado = new JRadioButton("Desempleado");
    BotonDesempleado.setBounds(25, 600, 120, 25);
    BotonDesempleado.setActionCommand("Desempleado");
    GrupoOcupacion.add(BotonDesempleado);
    add(BotonDesempleado);

    BotonJubiladoSinPension = new JRadioButton("Jubilado s/pensión");
    BotonJubiladoSinPension.setBounds(171, 600, 150, 25);
    BotonJubiladoSinPension.setActionCommand("Jubilado sin pensión");
    GrupoOcupacion.add(BotonJubiladoSinPension);
    add(BotonJubiladoSinPension);

    BotonJubiladoConPension = new JRadioButton("Jubilado c/pensión");
    BotonJubiladoConPension.setBounds(347, 600, 150, 25);
    BotonJubiladoConPension.setActionCommand("Jubilado con pensión");
    GrupoOcupacion.add(BotonJubiladoConPension);
    add(BotonJubiladoConPension);

    BotonProfesionista = new JRadioButton("Profesionista independiente");
    BotonProfesionista.setBounds(523, 600, 220, 25);
    BotonProfesionista.setActionCommand("Profesionista independiente");
    GrupoOcupacion.add(BotonProfesionista);
    add(BotonProfesionista);

    BotonPatron = new JRadioButton("Patrón(a) / jefe(a) / empresario(a)");
    BotonPatron.setBounds(769, 600, 260, 25);
    BotonPatron.setActionCommand("Patrón(a) / jefe(a) / empresario(a)");
    GrupoOcupacion.add(BotonPatron);
    add(BotonPatron);

    BotonAmaDeCasa = new JRadioButton("Ama de casa");
    BotonAmaDeCasa.setBounds(1055, 600, 110, 25);
    BotonAmaDeCasa.setActionCommand("Ama de casa");
    GrupoOcupacion.add(BotonAmaDeCasa);
    add(BotonAmaDeCasa);

    LabelReligion = new JLabel("Religión:");
    LabelReligion.setBounds(25, 630, 130, 25);
    add(LabelReligion);

    GrupoReligion = new ButtonGroup();
    BotonNinguna = new JRadioButton("Ninguna");
    BotonNinguna.setBounds(25, 655, 90, 25);
    BotonNinguna.setActionCommand("Ninguna");
    GrupoReligion.add(BotonNinguna);
    add(BotonNinguna);

    BotonCatolica = new JRadioButton("Católica");
    BotonCatolica.setBounds(140, 655, 90, 25);
    BotonCatolica.setActionCommand("Católica");
    GrupoReligion.add(BotonCatolica);
    add(BotonCatolica);

    BotonCristiana = new JRadioButton("Cristiana");
    BotonCristiana.setBounds(255, 655, 90, 25);
    BotonCristiana.setActionCommand("Cristiana");
    GrupoReligion.add(BotonCristiana);
    add(BotonCristiana);

    BotonJudio = new JRadioButton("Judío");
    BotonJudio.setBounds(370, 655, 60, 25);
    BotonJudio.setActionCommand("Judío");
    GrupoReligion.add(BotonJudio);
    add(BotonJudio);

    BotonGuardar = new JButton("Guardar información");
    BotonGuardar.setBounds(1000, 655, 175, 25);
    add(BotonGuardar);
  }
}
