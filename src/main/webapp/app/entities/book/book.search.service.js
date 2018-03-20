(function() {
    'use strict';

    angular
        .module('mygatewayappApp')
        .factory('BookSearch', BookSearch);

    BookSearch.$inject = ['$resource'];

    function BookSearch($resource) {
        var resourceUrl =  'microserviceapp/' + 'api/_search/books/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true}
        });
    }
})();
