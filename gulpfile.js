var gulp = require('gulp');
var jasmine = require('gulp-jasmine');

gulp.task('default', function() {
  // place code for your default task here
  console.log('Hello World');
});

gulp.task('test', function () {
    return gulp.src('src/test/webapp/test.js')
        .pipe(jasmine());
});