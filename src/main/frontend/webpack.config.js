//const path = require('path');
//
//module.exports = {
//  mode: 'development',
//  entry: './src/app.js',
//  output: {
//    filename: 'bundle.js',
//    path: path.join(__dirname, './dist/')
//  },
//  module: {
//    rules: [{
//      test: /\.js$/,
//      loader: 'babel-loader',
//      query: {
//        presets: [
//          'es2015',
//        ],
//        plugins: [],
//      },
//      include: [
//        path.resolve(__dirname, './')
//      ]
//    }]
//  }
//};

const path = require('path')
const webpack = require('webpack')
//    const HtmlWebpackPlugin = require('html-webpack-plugin')

module.exports = {
  entry: [
    './src/app.js'
  ],
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, './dist')
  },
  module: {
    rules: [{
      test: /\.js$/,
      loader: 'babel-loader',
      query: {
        presets: [
          'es2015'
        ],
        plugins: []
      },
      include: [
        path.resolve(__dirname, './')
      ]
    }]
  },
  devServer: {
    contentBase: './dist'
  },
}
