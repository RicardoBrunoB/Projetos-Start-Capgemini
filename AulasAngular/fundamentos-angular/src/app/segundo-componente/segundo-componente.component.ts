import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
  nome = "João";
  dataNascimento = "1992-08-10";
  urlImagem = "/assets/interna-blog-coding-05.jpg";

  mostrarDataNascimento() {
    alert(`A data de nascimento do João é: ${this.dataNascimento}`)
  }
}
