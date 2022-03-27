import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FEmax';
  serverId:number=10;
  serverStatus:string='offline';

  constructor(){
    this.serverStatus = Math.random()>0.5?'online':'offline';
  }
  getColor(){
    return this.serverStatus==='online'?'green':'red';
  }
  getServerStatus(){
    return this.serverStatus;
  }
}
