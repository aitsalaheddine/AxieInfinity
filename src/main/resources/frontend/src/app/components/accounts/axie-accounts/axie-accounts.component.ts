import { Component, OnInit } from '@angular/core';
import {AccountService} from "../../../services/account.service";
import {ColumnApi, GridApi} from "ag-grid-community";

@Component({
  selector: 'app-axie-accounts',
  templateUrl: './axie-accounts.component.html',
  styleUrls: ['./axie-accounts.component.css']
})
export class AxieAccountsComponent implements OnInit {
  private gridColumnApi: any;
  private gridApi: any;
  gridOptions: any = {
    rowHeight: 30,
    defaultColDef: {
      resizable: true,
      flex: 1,
      minWidth: 80,
    },
    frameworkComponents: {
    }
  };

  constructor( private accountService: AccountService) { }

  ngOnInit(): void {}

  getAccounts(profileId: number) {
    return this.accountService.getAccounts(profileId).subscribe(response => {
      this.gridApi.setRowData(response);
      this.gridApi.sizeColumnsToFit();
    });
  }

  onGridReady(params: any) {
    this.gridApi = params.api;
    this.gridColumnApi = params.columnApi;
    this.gridApi.setColumnDefs([
      {colId: 'id', field: 'id', headerName: 'Account Id'},
      {colId: 'playerName', field: 'playerName', headerName: 'playerName'},
      {colId: 'claimable_total', field: 'claimable_total', headerName: 'Claimable'},
      {colId: 'last_claimed_item_at', field: 'last_claimed_item_at', headerName: 'Last Claim'},
      {colId: 'next_claim_at', field: 'next_claim_at', headerName: 'Next Claim'},
      {colId: 'total', field: 'total', headerName: 'total'},
    ]);
    this.getAccounts(1);
  }
}
