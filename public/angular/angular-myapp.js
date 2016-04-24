var app = angular.module("sampleApp", ["firebase"]);

app.controller("SampleCtrl", function($scope, $firebaseObject) {
    var ref = new Firebase("https://brilliant-fire-9754.firebaseio.com/spice");

    // download the data into a local object
    var syncObject = $firebaseObject(ref);
    console.log(syncObject)
    // synchronize the object with a three-way data binding
    // click on `index.html` above to see it used in the DOM!
    syncObject.$bindTo($scope, "spice");
    $scope.getSpice = function (spice) {
        var i = 0;
        for (var key in spice) {
            if (i == 2)
            return spice[key];
            i++;
        }
    }
    $scope.getPercent = function (spice) {
        if (spice.max_amount == 0) return 0;
        return spice.current_amount / spice.max_amount * 100;
    }
    $scope.getPercentText = function (spice) {
        return $scope.getPercent(spice).toFixed(2);
    }
    $scope.getStyle = function (spice) {
        return {
            width : $scope.getPercent(spice) + '%'
        }
    }
    $scope.getPhrase = function (spice) {
        var phrase = spice.current_amount.toFixed(2) + ' ' + $scope.getUnit (spice.unit)+ ' Out Of '  + spice.max_amount.toFixed(2) + ' ' + $scope.getUnit (spice.unit);
        return  phrase;
    }

    $scope.getUnit = function (unit) {
        var regExp = /\(([^)]+)\)/;
        var matches = regExp.exec(unit);


            return matches[1];

    }
});