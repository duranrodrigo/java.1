Data() {
// day = 1;
// month = 1;
// year = 1970;
this(1, 1, 1970)
}
Data(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;
}

String obterDataFormatada() {
final String formato = "%d/%d/%d";
return String.format(formato, this.day, month, this.year);
}

void imprimirdataformatada() {
formato = "%d/%d/%d";
System.out.println(obterDataFormatada());
}
