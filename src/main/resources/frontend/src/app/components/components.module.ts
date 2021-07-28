import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';
import {NgbDateAdapter, NgbDateNativeAdapter, NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { AccountDetailComponent } from './account-detail/account-detail.component';
import 'ag-grid-enterprise';
import {AccountService} from "../../services/account.service";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { PlayersComponent } from './players/players.component';
import { PlayerDetailsComponent } from './player-details/player-details.component';
import {AgGridModule} from "ag-grid-angular";
import {NzSelectModule} from "ng-zorro-antd/select";
import {NzModalModule} from "ng-zorro-antd/modal";
import {NzDatePickerModule} from "ng-zorro-antd/date-picker";
import {NgZorroAntdModule} from "ng-zorro-antd";

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule,

    AgGridModule,
    NgZorroAntdModule,
    NzSelectModule,
    NzModalModule,
    NzDatePickerModule
  ],
  declarations: [
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    AccountDetailComponent,
    PlayersComponent,
    PlayerDetailsComponent
  ],
  exports: [
    FooterComponent,
    NavbarComponent,
    SidebarComponent
  ],
  providers:
    [AccountService, {provide: NgbDateAdapter, useClass: NgbDateNativeAdapter}]
})
export class ComponentsModule { }
