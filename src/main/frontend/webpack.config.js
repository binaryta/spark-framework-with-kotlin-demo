const path = require('path')

module.exports = {
  entry: [ './src/app.js' ],
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, './dist')
  },
  module: {
    rules: [{
      test: /\.js$/,
      loader: 'babel-loader',
      query: {
        presets: [ 'es2015' ],
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
