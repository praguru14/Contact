import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrls: ['./cockpit.component.css']
})
export class CockpitComponent implements OnInit {
  @Output() serverCreated = new EventEmitter<{ serverName: string, serverContent: string }>();
  @Output() blueprintCreated = new EventEmitter<{ serverName: string, serverContent: string }>();;
  newServerName = '';
  newServerContent = '';
  @ViewChild('contentInput',{static:true}) serverInputContent:ElementRef;
  constructor() { }

  ngOnInit(): void {
  }


  onAddServer(inServer:HTMLInputElement) {
    console.log(this.serverInputContent);
    
    this.serverCreated.emit({
      serverName: inServer.value,
      serverContent: this.serverInputContent.nativeElement.value
    });
  }

  onAddBlueprint(inBlueprint:HTMLInputElement) {
    this.serverCreated.emit({
      serverName: inBlueprint.value,
      serverContent: this.serverInputContent.nativeElement.value
    });
  }
}
