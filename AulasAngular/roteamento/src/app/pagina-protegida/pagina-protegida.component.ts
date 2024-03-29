import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-pagina-protegida',
  templateUrl: './pagina-protegida.component.html',
  styleUrls: ['./pagina-protegida.component.css']
})
export class PaginaProtegidaComponent {
  constructor(
    private auth: AuthService,
    private router: Router
  ) { }

  ngOnInit(): void { }

  logout() {
    this.auth.logout();
    this.router.navigate([""]);
  }
}
