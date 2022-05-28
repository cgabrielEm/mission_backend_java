<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;


//Route::get('v1/usuarios',"App\Http\Controllers\UsuarioController@index");// Metodo principal, obtiene todo
Route::get('v1/usuario',[App\Http\Controllers\UsuarioController::class,"index"]);
Route::post('v1/usuario',[App\Http\Controllers\UsuarioController::class,"store"]);
