import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent implements OnInit {
  addPlayerForm: FormGroup;
  

  constructor(
      private fb: FormBuilder,
      private playerService: PlayersService,
      private router: Router
  ) {
      this.addPlayerForm = this.fb.group({
        playerName: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
        jerseyNumber: [null, [Validators.required, Validators.min(1), Validators.pattern('^[0-9]*$')]],
        role: ['', Validators.required],
        totalMatches: [null, [Validators.required, Validators.min(1), Validators.pattern('^[0-9]*$')]],
        teamName: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
        country: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
        description: ['', [Validators.maxLength(200)]]
      });
    
  }

  ngOnInit() {
      
  }

  onSubmit(): void {
      if (this.addPlayerForm.valid) {
          this.playerService.addPlayer(this.addPlayerForm.value).subscribe({
              next: () => {
                  alert('Player added successfully');
                  this.router.navigate(['/displayall']);
              },
              error: (err) => {
                  console.error('Error adding player:', err);
              }
          });
      } else {
          alert('Please fill in all required fields');
      }
  }
}
