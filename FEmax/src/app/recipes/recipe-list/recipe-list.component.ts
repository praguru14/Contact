import { Component, OnInit } from '@angular/core';
import { Recipe } from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes:Recipe[]=[
    new Recipe("Maggi", "Gets ready in 2 mins","https://m.media-amazon.com/images/I/81dpDHc95AL._SL1500_.jpg"),
    new Recipe("Pizza", "Gets ready in 10 mins","https://www.vegrecipesofindia.com/wp-content/uploads/2020/11/pizza-recipe-2-500x375.jpg"),
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
