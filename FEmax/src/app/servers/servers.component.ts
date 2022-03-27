import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allNewServers: boolean = false;
  serverCreationStatus: string = 'No server was created!';
  serverName = '';
  username: string = ''
  usernameCreate:boolean=false;
  constructor() {
    setTimeout(() => {
      this.allNewServers = true;
    }, 3000)
  }


  ngOnInit(): void {
  }

  usernameEmpty() {
    if (this.username !== '') {
      this.username = '';
    }
  }


  onCreateServer() {

    this.serverCreationStatus = 'Server was created! Name is ';
  }

  onUpdateScreen(event: any) {
    this.serverName = event.target.value;
    console.log(this.serverName);
  }


}
